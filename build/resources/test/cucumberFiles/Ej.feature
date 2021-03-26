Feature: User

  @User
  Scenario: Como usuario
            Quiero crear, actualizar y borrar un usuario
            Para tener control de mi cuenta.

    Given Tengo acceso a Todo.ly
    When Mando un POST al url https://todo.ly/api/user.json con el json
    """
    {
      "Email":"mauriTest1@mauri.com",
      "FullName": "Mauricio",
      "Password": "1234"
    }
    """
    Then Espero el codigo de respuesta 200
    And Espero que el body de la respuesta sea
    """
    {"Id":IGNORE,"Email":"mauriTest1@mauri.com","Password":null,"FullName":"Mauricio","TimeZone":0,"IsProUser":false,"DefaultProjectId":IGNORE,"AddItemMoreExpanded":false,"EditDueDateMoreExpanded":false,"ListSortType":0,"FirstDayOfWeek":0,"NewTaskDueDate":-1,"TimeZoneId":"Pacific Standard Time"}
    """

    When Mando un PUT al url https://todo.ly/api/user/0.json con el json el email mauriTest1@mauri.com y el password 1234
    """
    {
      "FullName":"Mauri Update"
    }
    """
    Then Espero el codigo de respuesta 200
    And Espero que el body de la respuesta sea
    """
    {"Id":IGNORE,"Email":"mauriTest1@mauri.com","Password":null,"FullName":"Mauri Update","TimeZone":0,"IsProUser":false,"DefaultProjectId":IGNORE,"AddItemMoreExpanded":false,"EditDueDateMoreExpanded":false,"ListSortType":0,"FirstDayOfWeek":0,"NewTaskDueDate":-1,"TimeZoneId":"Pacific Standard Time"}

    """

    #DELETE
    When Mando un DELETE al url https://todo.ly/api/user/0.json el email mauriTest1@mauri.com y el password 1234
    Then Espero el codigo de respuesta 200
    And Espero que el body de la respuesta sea
    """
    {"Id":IGNORE,"Email":"mauriTest1@mauri.com","Password":null,"FullName":"Mauri Update","TimeZone":0,"IsProUser":false,"DefaultProjectId":IGNORE,"AddItemMoreExpanded":false,"EditDueDateMoreExpanded":false,"ListSortType":0,"FirstDayOfWeek":0,"NewTaskDueDate":-1,"TimeZoneId":"Pacific Standard Time"}

    """