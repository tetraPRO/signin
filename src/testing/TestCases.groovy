package testing

import signin.util.Data

class TestCases extends GroovyTestCase{

        void testSignin(){
        assert sql.isConnected()
    }

    void testcheckNameandPass(){
        Data sql = new Data()
        String[] params = ['Sammy Davis', '123pass678word']
        assert sql.checkUserPass(params)
    }
}
