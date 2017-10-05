
package com.app.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class Ser {
	@Autowired
	private Rep rep;
	List<Tser> arr=new ArrayList<Tser>( Arrays.asList(new Tser("swarna","13"),new Tser("swarna1","13")));
	public List<Tser> hi1()
	{
	List<Tser>a=new ArrayList<Tser>();
	rep.findAll().forEach(a::add);
	return a;
	}
	public Tser get(String n)
	{
		return arr.stream().filter(t->t.getName().equals(n)).findFirst().get();
		
	}
	public void add(Tser u) {
		// TODO Auto-generated method stub
		rep.save(u);
	}
	public void update(String name, Tser ul) {
		// TODO Auto-generated method stub
	for(int i=0;i<arr.size();i++)
	{
		Tser u=arr.get(i);
		if(u.getName().equals(name))
		{
			arr.set(i,ul);
			return;
		}
	}
	}
	public void rem(String name) {
		// TODO Auto-generated method stub
		arr.removeIf(t->t.getName().equals(name));
	}
}
