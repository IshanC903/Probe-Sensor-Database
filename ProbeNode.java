//Ishan Chaurasia
//101011068
//NET 3004 - Assignment 3
//Nov 19, 2018

public class ProbeNode {
	
	public Probe aProbe;
	public ProbeNode next;
	
	public ProbeNode() //Default Constructor
	{
		
	}
	
	public ProbeNode(Probe aProbe)
	{
		this.aProbe = aProbe;
		next = null;
	}
	
	public ProbeNode(ProbeNode aNode)
	{
		Probe tmpProbe = aNode.aProbe;
		aProbe = new Probe (tmpProbe.getDestPort(), tmpProbe.getOriginIP(), tmpProbe.getOriginPort(), tmpProbe.getProbeTime());
		next = aNode.next;
	}
	
	public static void main(String[] args)
	{
		
	}
}
