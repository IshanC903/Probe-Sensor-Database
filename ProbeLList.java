//Ishan Chaurasia
//101011068
//NET 3004 - Assignment 3
//Nov 19, 2018

import java.util.*;

public class ProbeLList {
	
	private ProbeNode head;
	private ProbeNode tail;
	
	public ProbeLList()
	{
		head = null;
		tail = null;
	}
	
	public ProbeLList(ProbeLList aList)
	{
		if(aList.head == null)
		{
			head = null;
			tail = null;
		}
		else
		{
			head = new ProbeNode(aList.head);
			ProbeNode tmpDest = head;
			ProbeNode tmpSrc = aList.head;
			
			while(tmpSrc.next != null)
			{
				tmpDest = new ProbeNode(tmpSrc);
				tmpDest = tmpDest.next;
				tmpSrc = tmpSrc.next;
			}
			
			tail = new ProbeNode(aList.tail);
		}
	}
	
	public int getActualSz()
	{
		int size = 0;
		ProbeNode temp = head;
		
		while(temp != null)
		{
			size++;
			temp = temp.next;
		}
		return size;
	}
	
	private int getActualSz(ProbeNode head)
	{
		int size = 0;
		ProbeNode temp = head;
		while(temp != null)
		{
			size++;
			temp = temp.next;
		}
		return size;
	}
	
	public int insertProbe(Probe probe)
	{
		if(head == null)
		{
			head = new ProbeNode(probe);
			tail = head;
			return 0;
		}
		else
		{
			int element = 1;
			ProbeNode temp = head;
			while(temp.next != null)
			{
				element++;
				temp = temp.next;
			}
			temp.next = new ProbeNode(probe);
			tail = temp.next;
			return element;
		}
	}
	
	public int countProbes(String ip)
	{
		int temp = getProbes(ip).size();
		return temp;
	}
	
	public int countProbes(int destPort)
	{
		int temp = getProbes(destPort).size();
		return temp;
	}
	
	public ArrayList<String> getProbes(int destPort)
	{
		ArrayList<String> myArr = new ArrayList<String>();
		ProbeNode tmpNode = head;
		
		while(tmpNode != null)
		{
			Probe tmpProbe = tmpNode.aProbe;
			
			if(tmpProbe.getDestPort() == destPort)
			{
				myArr.add(tmpProbe.getOriginIP());
			}
			tmpNode = tmpNode.next;
		}		
		return myArr;
	}
	
	public ArrayList<Probe> getProbes(String ip)
	{
		ArrayList<Probe> myArr = new ArrayList<Probe>();
		ProbeNode tmpNode = head;
		
		while(tmpNode != null)
		{
			Probe tmpProbe = tmpNode.aProbe;
			
			if(tmpProbe.getOriginIP().equals(ip))
			{
				myArr.add(tmpProbe);
			}
			tmpNode = tmpNode.next;
		}		
		return myArr;
	}
	
	
	public static void main(String[] args)
	{
		
	}
}
