# My Tests RestAssurred-CricketTeams
This is a maven project, tests are written using TestNG framework using Java RestAssurred API at core.<br/>

Run test script as TestNG Test
Please find a java file for aimed test script @ /src/test/java/com/org/team/ipl/player_tests/ValidatePlayersInIPLTeam.java   <br/>
Use Property file to input, file path: \src\test\java\com\org\team\ipl\resources\Teams.properties.  <br/>
For changing Value for Key "myteam" in Teams.properties file, please use below values only. <br/>
Value = "RCB"   for Successfull validation.  <br/>
Value = "MI"    for Failing validations imposed.  <br/>

To execute test cases- I have created a Postman Mock Server (a request example over) to mock reponse as required Json object. <br/>
To verify a successfull Json data in response, please enter url in your browser- https://cb5d4d43-93de-4436-8d52-d755454d067b.mock.pstmn.io/getRCB . <br/>
To verify a failed Json data in response, please enter url in your browser- https://cb5d4d43-93de-4436-8d52-d755454d067b.mock.pstmn.io/getMI . <br/>
