Exercise 7.2.2.8

Design and implement a program that will compute all prime paths in a graph, then derive test paths to tour the prime paths. Although the user interface can be arbitrarily complicated, the simplest version will be to accept a graph as input by reading a list of nodes, initial nodes, final nodes, and edges.

```java
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class PathList {
	protected List<Path> pl;

	public PathList() {
		pl = new LinkedList<Path>();
	}

	public PathList(List<Node> _nodes) {
		pl = new LinkedList<Path>();
		initNodes(_nodes);
	}

	public void initNodes(List<Node> _nodeList) {
		Path p;
		for(int i = 0; i < _nodeList.size(); i++) {
			Node node = _nodeList.get(i);
			p = new Path(node);
			pl.add(p);
		}
	}

	public Iterator<Path> iterator() {
		return pl.iterator();
	}

	public void add(Path _p) {
		pl.add(_p);
	}

	public int size() {
		return pl.size();
	}

	public String toString() {
		Collections.sort(pl, new Comparator<Path>() {
			public int compare(Path _s1, Path _s2) {
				if(_s1.len() == _s2.len()) {
					int len = _s1.len();
					for(int i = 0; i < len; i++) {
						if(_s1.GetNode(i).GetNodeNumber() != _s2.GetNode(i).GetNodeNumber()) {
							return(_s1.GetNode(i).GetNodeNumber() - _s2.GetNode(i).GetNodeNumber());
						}
					}
					return 0;
				}
				else	
					return _s1.len() - _s2.len();
			}
		});

		Path p;
		String res = "";
		for(int i = 0; i < pl.size(); i++) {
			p = pl.get(i);
			res += p + " ";
		}
		return res;
	}
} 
```