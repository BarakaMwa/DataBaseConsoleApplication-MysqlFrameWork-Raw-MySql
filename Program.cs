// See https://aka.ms/new-console-template for more information

using System;
using MySql.Data.MySqlClient;

namespace DataBaseConsoleApplication
{
    public class Program
    {
        public static int Main()
        {
            //your MySQL connection string
            string dbConnection = "server=localhost;user=root;database=sakila;port=3399;password=rootmysql";
            MySqlConnection conn = new MySqlConnection(dbConnection);


            int showMenu = 1;
            while (showMenu != 0)
            {
                showMenu = MainMenu(showMenu, conn);
            }

            return showMenu;
        }

        private static int MainMenu(int showMenu, MySqlConnection conn)
        {
            Console.WriteLine("Welcome To Sakila Database");
            Console.WriteLine("Enter 1 to View Tables");
            Console.WriteLine("Enter 2 to Add Actor");
            Console.WriteLine("Enter 3 to Edit Actor");
            Console.WriteLine("Enter 4 to Delete Actor");
            Console.WriteLine("Enter 5 to View Actors");
            Console.WriteLine("Enter 6 to Search Actor");
            Console.WriteLine("Enter 0 to Exit Program");

            // Create a string variable and get user input from the keyboard and store it in the variable
            int choice = Convert.ToInt32(Console.ReadLine());
            switch (choice)
            {
                case 1:
                    ViewTables(conn);
                    break;
                case 2:
                    AddActor(conn);
                    break;
                case 3:
                    EditActor(conn);
                    break;
                case 4:
                    DeleteActor(conn);
                    break;
                case 5:
                    ViewActors(conn);
                    break;
                case 6:
                    SearchActors(conn);
                    ReturnToMainMenu();
                    break;
                case 0:
                    showMenu = choice;
                    Console.WriteLine("Exiting Program");
                    break;
                default:
                    Console.WriteLine("Invalid Input");
                    break;
            }

            return showMenu;
        }

        private static void SearchActors(MySqlConnection conn)
        {
            conn.Open();
            Console.WriteLine("To Search Actor");
            Console.WriteLine("Enter First Name");
            string? searchName = Console.ReadLine();

            bool status = GetActors(searchName, conn);
            if (!status)
            {
                Console.WriteLine("Can Not Search Or Find Actor");
            }

            conn.Close();
        }

        private static bool GetActors(string? searchName, MySqlConnection conn)
        {
            bool status = true;
            try
            {
                Console.WriteLine("Getting Data...");
                //SQL Query to execute
                string statementLike = " '%" + searchName + "%' or last_name LIKE '%" + searchName + "%' ";
                string sql = "SELECT * FROM actor WHERE first_name LIKE " + statementLike + " ";
                MySqlCommand cmd = new MySqlCommand(sql, conn);
                MySqlDataReader rdr = cmd.ExecuteReader();

                if (!rdr.HasRows)
                {
                    status = false;
                }
                else
                {
                    //read the data
                    while (rdr.Read())
                    {
                        Console.WriteLine(rdr[0] + " -- " + rdr[1] + " -- " + rdr[2]);
                    }
                }

                rdr.Close();
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
                status = false;
            }

            return status;
        }

        private static void EditActor(MySqlConnection conn)
        {
            SearchActors(conn);
            conn.Open();
            Console.WriteLine("Enter Actor Number You Want To Edit");
            int actorId = Convert.ToInt32(Console.ReadLine());
            bool status = GetActorEditor(actorId, conn);
            if (!status)
            {
                Console.WriteLine("Can Not Edit Or Find Actor");
            }

            conn.Close();
        }

        private static bool GetActorEditor(int actorId, MySqlConnection conn)
        {
            bool status = true;
            Console.WriteLine("Editing...");
            Console.WriteLine("Enter New Actor First Name");
            Console.WriteLine("Or Zero To Skip");
            string? value = Console.ReadLine();
            string column = "first_name";

            status = CheckValueQueryStatus(actorId, conn, value, column, status);

            Console.WriteLine("Enter New Actor Last Name");
            Console.WriteLine("Or Zero To Skip");
            value = Console.ReadLine();
            column = "last_name";

            status = CheckValueQueryStatus(actorId, conn, value, column, status);

            return status;
        }

        private static bool CheckValueQueryStatus(int actorId, MySqlConnection conn, string? value, string column,
            bool status)
        {
            switch (value)
            {
                case "0":
                    Console.WriteLine(column + " Skipped");
                    break;
                default:
                    status = QueryEditActorNames(column, value, conn, actorId);
                    if (!status)
                    {
                        Console.WriteLine(column + " Failed to Update");
                    }

                    break;
            }

            return status;
        }

        private static bool QueryEditActorNames(string? column, string? value, MySqlConnection conn, int actorId)
        {
            bool status = true;

            try
            {
                string sql = "UPDATE actor SET " + column + "='" + value + "' WHERE actor_id=" + actorId;
                MySqlCommand cmd = new MySqlCommand(sql, conn);
                object result = cmd.ExecuteNonQuery();

                if (result == null)
                {
                    status = false;
                }
                else
                {
                    Console.WriteLine(column + "  Updated ");
                }
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
                status = false;
            }

            return status;
        }

        private static void DeleteActor(MySqlConnection conn)
        {
            SearchActors(conn);
            conn.Open();
            Console.WriteLine("Enter Actor Number You Want To Delete");
            int actorId = Convert.ToInt32(Console.ReadLine());
            bool status = DeleteActorQuery(actorId, conn);
            if (!status)
            {
                Console.WriteLine("Could Not Delete Actor");
            }

            conn.Close();
        }

        private static bool DeleteActorQuery(int actorId, MySqlConnection conn)
        {
            bool status = true;
            try
            {
                string sql = "DELETE FROM actor WHERE actor_id=" + actorId;
                MySqlCommand cmd = new MySqlCommand(sql, conn);
                object result = cmd.ExecuteNonQuery();

                if (result == null)
                {
                    status = false;
                }
                else
                {
                    Console.WriteLine(" Actor Deleted ");
                }
            }
            catch (Exception e)
            {
                Console.WriteLine(e);
                status = false;
            }

            return status;
        }


        private static void ViewActors(MySqlConnection conn)
        {
            try
            {
                Console.WriteLine("Getting Data...");
                conn.Open();
                int startRow = 0;
                //SQL Query to execute
                //selecting only first 10 rows for demo
                string sql = "select * from sakila.actor limit " + startRow + ",10;";
                MySqlCommand cmd = new MySqlCommand(sql, conn);
                MySqlDataReader rdr = cmd.ExecuteReader();

                //read the data
                if (rdr.HasRows)
                {
                    while (rdr.Read())
                    {
                        Console.WriteLine(rdr[0] + " -- " + rdr[1] + " -- " + rdr[2]);
                    }
                }
                else
                {
                    Console.WriteLine("Can Not Find Actors");
                }


                rdr.Close();
            }
            catch (Exception err)
            {
                Console.WriteLine(err.ToString());
            }

            conn.Close();
            ReturnToMainMenu();
        }

        private static void ViewTables(MySqlConnection conn)
        {
            try
            {
                Console.WriteLine("Getting Data...");
                conn.Open();
                //SQL Query to execute
                //selecting only first 10 rows for demo
                string sql =
                    "SELECT table_name FROM sys.schema_table_statistics_with_buffer WHERE table_schema = 'sakila';";
                MySqlCommand cmd = new MySqlCommand(sql, conn);
                MySqlDataReader rdr = cmd.ExecuteReader();
                if (rdr.HasRows)
                {
                    //read the data
                    while (rdr.Read())
                    {
                        Console.WriteLine(rdr[0]);
                    }
                }
                else
                {
                    Console.WriteLine("No tables found");
                }

                rdr.Close();
            }
            catch (Exception err)
            {
                Console.WriteLine(err.ToString());
            }

            conn.Close();
            ReturnToMainMenu();
        }

        private static void AddActor(MySqlConnection conn)
        {
            conn.Open();
            Console.WriteLine("Add Actor Enter First Name");
            string? firstName = Console.ReadLine();
            Console.WriteLine("Add Actor Enter Last Name");
            string? lastName = Console.ReadLine();

            bool status = InsertActor(firstName, lastName, conn);
            if (!status)
            {
                ReturnToMainMenu();
            }

            conn.Close();
        }

        private static bool InsertActor(string? firstName, string? lastName, MySqlConnection conn)
        {
            bool status = true;
            try
            {
                Console.WriteLine("Inserting Data...");
                //SQL Query to execute
                string sql = "INSERT INTO actor (first_name,last_name) VALUES ('" + firstName + "','" + lastName + "')";
                MySqlCommand cmd = new MySqlCommand(sql, conn);
                cmd.ExecuteNonQuery();

                //insert the data
                Console.WriteLine("Actor Added");
                ReturnToMainMenu();
            }
            catch (Exception e)
            {
                Console.WriteLine("Can Not Add Actor" + e);
                status = false;
            }

            return status;
        }

        private static void ReturnToMainMenu()
        {
            Console.WriteLine("Enter 1-Return To Menu...");
            // Create a string variable and get user input from the keyboard and store it in the variable
            int choice = Convert.ToInt32(Console.ReadLine());
            switch (choice)
            {
                case 1:
                    Main();
                    break;
                default:
                    Console.WriteLine("Invalid Input");
                    ReturnToMainMenu();
                    break;
            }
        }
    }
}