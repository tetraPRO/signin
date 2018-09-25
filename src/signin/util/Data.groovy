package signin.util

import groovy.sql.Sql

class Data {

    Password pass = new Password()

    private final DRIVER = 'com.mysql.cj.jdbc.Driver'
    private final USER = 'tetrapro'
    private final PASS = pass.getPass()
    private final SQLURL = 'jdbc:mysql://localhost:3306/signin?autoReconnect=true&useSSL=false'

    def connection

    Data(){
        connection = Sql.newInstance(SQLURL, USER, new String(PASS), DRIVER)
    }

    def isConnected(){
        connection ? true : false
    }

    def checkUserPass(String[] params){
        boolean isSuccess = false
        def sql = "SELECT user_name, user_pass FROM users WHERE user_name = ${params[0]} AND user_pass = ${params[1]}"

        connection.execute sql
        isSuccess = true
        isSuccess
    }
}
