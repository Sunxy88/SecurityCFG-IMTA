# Read me
Work progress and things to do for every week.

## 8th Week
Done: 
1. Store EMF model in disk in XML form

TODO:
1. Load RBACModel.xml in Eclipse

## 7th Week
Done:
1. Make given data structures available in project
2. Save result in data structures instead of a map structure
    1. Role name (a string) is in `Role`
    2. The executed statements after a security check are stored
     in [`xisong.model.programmaticAC.Execute`](src/main/java/xisong/model/programmaticAC/Execute.java)
    3. `Permission` maintains a list of `Execute`
    4. `Role` has a list of `Permission`


Solved Problem:
1. A strange problem occurs everytime when `SpoonAPI.buildModel()` is excuted. To be specific, spoon throws a runtime 
exception and says that there is a class that has been already defined, 
which is pretty much confusing because everything was normal two or three days ago. Without any change in code, 
this problem occured. -> Solved

    Solution: Update the version of the dependency of spoon core from 8.2.0-beta-14 to 8.2.0. And this problem 
    disappeared. No clue about it....


## 6th Week
Done:
1. Get a test exmaple of checkRole in try-catch structure and verify that the method
2. Export this project in Eclipse
3. Data structures have been generated

TODO:
1. No idea for the import of the dependency used in Eclipse Modeling Framework in a Maven project.

## 5th Week
Simple explication of class [SecurityElementMatcher](src/main/java/xisong/SecurityElementMatcher.java):
1. Key function is `roleStatementMap()` who aims to get a role-statements map.
2. Following steps are taken for the object:
    1. Use *matcher* in spoon to get all eligible code elements
    2. Use *filter* in spoon to get specific strucre, like if or try-catch
    3. Use regular expression to get roles
    4. Put statements in a list and then make this list bound with corresponding role in a map

DONE:
1. `subject.checkRole()` in try-catch structure, implemented
 [here in method `getTryStatements`](src/main/java/xisong/SecurityElementMatcher.java)
    * One problem : no example found
2. `subject.checkRole()` in a function who throws an exception if something goes wrong 
in the method `methodStatementMap(String target)` 
in class [`SecurityElementMatcher`](src/main/java/xisong/SecurityElementMatcher.java)
    * Able to get all methods that contain a `subject.checkRole()`
    * Working on extraction of all statemetns after the call of `subject.checkRole()`
3. `subject.isPermitted()` in if structure

TODO:
1. Test need to be done for `subject.checkRole()` in a try-catch structure. However, no example found until now.
2. Get more test exmaples in Github.
    

## 4th Week
1. Obtain all statements corresponding to each role.
2. Add 3 new complete application as test cases.

## 3rd Week
1. Obtain the block where a specific function is called. Check [here](src/test/java/xisong/MatcherTest.java).
For example:![demo1](src/test/resources/shiro-example/3/DemoPicture.png)

## 2nd Week
1. Shiro examples from :
    1. https://github.com/jjoe64/shiroexample
    2. little demo written by myself
2. [SecurityElementMatcher](src/main/java/xisong/SecurityElementMatcher.java) 
could find specified security element in given codes.
3. Result CFG could be stored in given directory in [GenerateCfg](src/main/java/xisong/GenerateCfg.java).

## 1st Week
1. Examples of different statements and corresponding control flow graphs 
are in the [folder here](src/test/resources/control-flow).
2. Example of the filter to search particular methods by given name is in
 [here](src/test/java/xisong/QueryParticularFunction.java).
3. For a Web application, a graph could be generated but **need to be refined**.
Because there are some strange begin blocks. 
