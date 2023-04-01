
public class MapNode<k,v> {
	k key;
	v value;
	MapNode<k,v> next;
	MapNode(k key,v value)
	{
		this.key=key;
		this.value=value;
	}

}
