package Lec94;

import java.util.*;

public class Replace_Words {
	class Trie {

		class Node {
			char ch;
			HashMap<Character, Node> child = new HashMap<>();
			boolean isterminal;

		}

		private Node root = new Node();

		public void Add(String s) {
			Node curr = root;
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (curr.child.containsKey(ch)) {
					curr = curr.child.get(ch);
				} else {
					Node nn = new Node();
					nn.ch = ch;
					curr.child.put(ch, nn);
					curr = nn;
				}
			}
			curr.isterminal = true;
		}

		public String repalce(String s) {
			// TODO Auto-generated method stub
			String rs="";
			Node curr=root;
			for (int i = 0; i < s.length(); i++) {
				if(curr.isterminal) {
					return rs;
				}
				char ch = s.charAt(i);
				if(curr.child.containsKey(ch)) {
					rs+=ch;
					curr=curr.child.get(ch);
				}
				else {
					return s;
				}
			}
			return rs;
		}
	}

	public String replaceWords(List<String> dictionary, String sentence) {
		Trie t = new Trie();
		for (String s : dictionary) {
			t.Add(s);
		}
		String[] arr = sentence.split(" ");
		String ans = "";
		for (int i = 0; i < arr.length; i++) {
          ans= ans+ t.repalce(arr[i])+" ";
		}
		return ans.trim();

	}

}
