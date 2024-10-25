package com.project.TL.Control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.TL.Model.TruckLoad;
import com.project.TL.Repo.TruckLRepo;
class Overload extends Exception
{
	public Overload(String msg) {
		super(msg);
	}
}
@Controller
public class TruckCon 
{
	@Autowired
	private TruckLRepo TLR;
	
	@RequestMapping("/")
	public String isLand()
	{
		return "Add.jsp";
	}
	@RequestMapping("/A")
	public String isL()
	{
		return "Add.jsp";
	}
	@RequestMapping("/Add")
	public String isAdd(@ModelAttribute TruckLoad TL,Model m)
	{
		long c=TL.getC();
		long lc=TL.getLc();
		if(c<lc)
		{
			try
			{
				throw new Overload("Overload Exception");
			}
			catch(Exception e)
			{
				m.addAttribute("m", e);
				return "/A";
			}
		}
		else
		{
			TLR.save(TL);
			m.addAttribute("m", "Data Added.!");
			return "/A";
		}
	}
	@RequestMapping("/F")
	public String isF(Model m)
	{
		List<TruckLoad> lt = TLR.findAll();
		m.addAttribute("t", lt);
		return "Fetch.jsp";
	}
}
