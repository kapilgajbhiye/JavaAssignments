package com.bridgelab.co.in;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
	private List<Contact> list = new ArrayList<Contact>();

	public List<Contact> getList() {
		return list;
	}

	public void setList(List<Contact> list) {
		this.list = list;
	}
	
	 public void addContact(Contact contactObj)
	    {
	        list.add(contactObj);
	    }
	
	public List<Contact> viewAllContacts(){
		return list;
		
	}
	
	public Contact viewContactGivenPhone(long phoneNumber) {
		Contact obj=new Contact();
        for(Contact obj1:list)
        {
            if(obj1.getPhoneNumber()==phoneNumber)
            {
                obj=obj1;
            }
        }
        return obj;
		
	}
	
	public boolean removeContact(long phoneNumber) {
		boolean f=false;
        for(Contact obj:list)
        {
            if(obj.getPhoneNumber()==phoneNumber)
            {
                f=true;
                list.remove(obj);
                break;
            }
        }
        return f;
		
	}
	
}
