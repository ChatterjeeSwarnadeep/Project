package com.app.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ass {
	@RequestMapping("/hi")
	public String hi()
	{
	return "hi";
	}
	@Autowired
	private Ser ser;
	@RequestMapping("/h")
	public List<Tser> hi1()
	{
	return ser.hi1();
	}
	@RequestMapping("/h/{id}")
	public Tser get(@PathVariable("id")String name)
	{
	return ser.get(name);
	}
	@RequestMapping(value="/h",method=RequestMethod.POST)
	public void add(@RequestBody Tser u)
	{
	ser.add(u);
	}
	@RequestMapping(value="/h/{id}",method=RequestMethod.PUT)
	public void update(@PathVariable("id")String name,@RequestBody Tser u)
	{
	ser.update(name,u);
	}
	@RequestMapping(value="/h/{id}",method=RequestMethod.DELETE)
	public void delete(@PathVariable("id")String name)
	{
	ser.rem(name);
	}

}
