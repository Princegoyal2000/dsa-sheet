import java.util.ArrayList;
import java.util.*;

class TrieNode{
	HashMap<Character,TrieNode> Node;
	char data;
	Boolean isTerminating;
	TrieNode children[];
	int childCount;
	
	public TrieNode(char data)
	{
		isTerminating=false;
		this.data=data;
		children= new TrieNode[26];
		childCount=0;
		Node = new HashMap<Character,TrieNode>();
	}
	
}
public class Trie {
	
	
	private TrieNode root;
	public Trie()
	{
		root = new TrieNode('\0');
	}
	public void remove(String word)
	{
		remove(root,word);
	}
	private void remove(TrieNode root, String word) {
		if(word.length()==0)
		{
			root.isTerminating = false;
			return;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null)
		{
			return ;
		}
		 remove( child , word.substring(1) );
		 //WE CAN REMOVE CHILD ONLY IF IT IS NON-TERMINATING AND ITS NUMBER OF CHILDREN ARE 0;
		 if(!child.isTerminating &&  child.childCount==0 )
		 {
			 root.children[childIndex]= null;
			 child = null;
			 root.childCount--;
		 }
//		 if(!child.isTerminating)
//		 {
//			 int numChild =0;
//			 for(int i=0;i<26;i++)
//			 {
//				 if(child.children[i] != null)
//				 {
//					 numChild++;
//				 }
//			 }
//			 if(numChild == 0)
//			 {
//				 // WE CAN DELETE CHILD
//				 root.children[childIndex]= null;
//				 child = null;
//			 }
//		 }
	}
	private int count_words(TrieNode root)
	{
		int result =0;
		if(root.isTerminating)
		{
			result++;
		}

		for(int i =0;i<26;i++)
		{
			if(root.children[i]!=null)
			{
				result += count_words(root.children[i]);
			}
		}
		return result;

		
	}
	public int count_words()
	{
		return count_words(root);
	}

	public Boolean search(String word)
	{
		return search(root,word);
	}
	private boolean search(TrieNode root, String word) {

		if(word.length()==0)
		{
			return root.isTerminating;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null)
		{
			return false;
		}
		return search( child , word.substring(1) );
	}
	public ArrayList<String> advanceSearch(String word)
	{
		ArrayList<String> auto_Cum_words = new ArrayList<String>();
		TrieNode curr	 = root;
		for(int i =0 ; i < word.length() ;i++)
		{
			curr= curr.Node.get(word.charAt(i));
			if(curr == null)
			{
				return auto_Cum_words;
			}    	
		}
		search(curr,auto_Cum_words,word);
		return auto_Cum_words;
	}
	private void search(TrieNode root,ArrayList<String> list, String prefix)
	{
		if(root == null)
			return ;
		
		
		if(root.isTerminating)
			list.add(prefix);
		
		HashMap<Character,TrieNode> map=root.Node;
		for(Character c :map.keySet())
		{
			search(map.get(c),list,prefix+String.valueOf(c));
		}
		

	}
	public  void add(String word)
	{
		add ( root , word );
	}
	private void add( TrieNode root , String word) {
		if(word.length()==0)
		{
			root.isTerminating = true;
			return;
		}
		int childIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[childIndex];
		if(child == null)
		{
			child = new TrieNode(word.charAt(0));
			root.children[childIndex] = child;
			root.childCount++;
		}
		add( child , word.substring(1) );
		
	}

}
