package java_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;

public class AList
{
	public static void main(String[] args)
	{
		ArrayList a = new ArrayList();
		a.add(234);
		a.add('d');
		a.add("sdfl;kjoir psdfjg; 3245634 6; )_*)_#(%*()#*)%_*#()%^");
		a.add(2354235345.34634735675367547);
		System.out.println(a);
		System.out.println("Size of a: "+a.size());
		System.out.println(a.get(2));
		
		LinkedList l = new LinkedList();
		l.add(54);
		l.add("asdg 4547 fd #$^ asd");
		l.add(234535.3463456);
		l.add('s');
		System.out.println(l);
		System.out.println("Size of l: "+l.size());
		System.out.println(l.get(3));
		
		a.addAll(l);
		System.out.println(a);
		System.out.println("Size of a: "+a.size());
		a.removeAll(l);
		System.out.println(a);
		System.out.println("Size of a: "+a.size());
		
		l.addAll(a);
		System.out.println(l);
		System.out.println("Size of l: "+l.size());
		l.removeAll(a);
		System.out.println(l);
		System.out.println("Size of l: "+l.size());
		
		HashSet h = new HashSet();
		h.addAll(l);
		System.out.println(h);
		System.out.println("Size of h: "+h.size());
		h.addAll(a);
		System.out.println(h);
		System.out.println("Size of h: "+h.size());
		h.add("hash set element");
		System.out.println(h);
		System.out.println("Size of h: "+h.size());
		h.add("hash set element");
		System.out.println(h);
		System.out.println("Size of h: "+h.size());
		h.add("hash set element1");
		System.out.println(h);
		System.out.println("Size of h: "+h.size());
		h.add("hash set element");
		System.out.println(h);
		System.out.println("Size of h: "+h.size());
		
		Hashtable t = new Hashtable();
		t.put(2, "sdkljfg");
		t.put(3, 'g');
		t.put(5, 3094875);
		System.out.println(t);
		System.out.println("Size of t: "+t.size());
		t.put('s', "dfgjk 348998 ()#*%");
		t.put(1, 45);
		t.put("random", 30489753.764563463456346);
		t.put(4, "sdg4 #%");
		System.out.println(t);
		System.out.println("Size of t: "+t.size());
		System.out.println(t.get('s'));
		System.out.println(t.get("random"));
		t.put("ss", "dfgjk 348998 ()#*%");
		System.out.println(t);
		t.put('s', "test value");
		System.out.println(t);
		
		
		HashMap m = new HashMap();
		m.put(1, 9034);
		System.out.println(m);
		m.put(1, 345);
		System.out.println(m);
		m.put(11, 345);
		System.out.println(m);
		m.put(11, "sdgr");
		System.out.println(m);
		

	}

}
