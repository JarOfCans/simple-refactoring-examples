package q1.extract_method.refactored;

import java.util.List;

public class A {
   Node m1(List<Node> nodes, String p) {
      extractedMethod(nodes, p);
      // other implementation
      return null;
   }

   Edge m2(List<Edge> edgeList, String p) {
      extractedMethod(edgeList, p);
      // other implementation
      return null;
   }

   // TODO: Your answer
   public <T extends Graph> void extractedMethod(List<T> inputList, String queryString) {
	   	//Tried to figure out what I was supposed to do but everything pointed to p5 
	   	//or a worse version of p5 so.... p5 but reworded it is.
	   	//In theory, I could have also put the loop in Graph but at that point it's
	   	//extract superclass rather than extract method
	   	//There also was p1, but that would just be replacing an output
	   	for (T check: inputList) {
	   		if (check.contains(queryString)) {
	   			System.out.println(check);
	   		}
	   	}
   	}
}

class Graph {
	String name;

	public boolean contains(String p) {
	    return name.contains(p);
	}
}

class Node extends Graph {
}

class Edge extends Graph {
}