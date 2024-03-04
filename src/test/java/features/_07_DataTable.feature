Feature: DAtaTable example

  Scenario:  user list

    When I write username "Mehmet"
    And I write username and password "mehmet" and "12345"
    And  I write usernames as DataTable
    |Aziza|
    |Hamza|
    |Polina|
    |Oguzhan|
    |Sahin  |
    |Samet  |
    |Tetiana|
     And I write username and password as DataTable

       |Aziza|123|
       |Hamza|3214|
       |Polina|46611|
       |Oguzhan|4545|
       |Sahin  |544545|
       |Samet  |0000  |
       |Tetiana|12345 |
