# My Tests RestAssurredCricketTeams
This test automation done with Java RestAssurred API. <br/> <br/>
I have created a postman mock server to mock reponse as required Json object. <br/>

Please use Property file to input- file path: \src\test\java\com\org\team\ipl\resources\Teams.properties.  <br/>
for changing Value for Key "myteam" in Teams.properties file, please use below. <br/>
Value = "RCB"   for Successfull validation.  <br/>
Value = "MI"    for Failing validations imposed.  <br/>


To verify a successfull Json data in response, please enter url in your browser- https://cb5d4d43-93de-4436-8d52-d755454d067b.mock.pstmn.io/getRCB . <br/>
To verify a failed Json data in response, please enter url in your browser- https://cb5d4d43-93de-4436-8d52-d755454d067b.mock.pstmn.io/getMI . <br/>
