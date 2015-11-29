<%@ page import="christmaslottery.Person" %>
<!doctype html>
<html lang="en" class="no-js">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title><g:layoutTitle default="Grails"/></title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <asset:stylesheet src="application.css"/>
        <asset:javascript src="jquery-2.1.3.js"/>
        <asset:javascript src="application.js"/>

        <g:layoutHead/>
    </head>
    <body>
        <div class="main">
            <div class="enterName">
                <span style="padding-right: 5px">Who are you?</span>
                <g:select id="nameSelect"
                          from="${Person.list()}"
                          name="nameSelect"
                          optionKey="name"
                          optionValue="name"/>
                <button id="submitName">Submit</button>
            </div>
            <div class="lotteryPick">
                <h3 id="outputMessage">YOUR PERSON WILL BE DISPLAYED HERE</h3>
            </div>
        </div>
    </body>
</html>
