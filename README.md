# Read me
1. Examples of different statements and corresponding control flow graphs 
are in the [folder here](src/test/resources/control-flow)
2. Example of the filter to search particular methods by given name is in
 [here](src/test/java/xisong/QueryParticularFunction.java)
3. For a Web application, a graph could be generated but **need to be refined**.
Because there are some strange begin blocks. 

# TODO
1. The offered maven dependency of [spoon](https://github.com/INRIA/spoon/tree/master/spoon-control-flow) does not work.
 Source code is directly used. **Possible to use package instead?** 
2. Filter is used instead of query to search methods, **Possible to use `CtQuery`?**