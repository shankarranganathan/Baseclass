package org.abc;

public class PageManager {
	Logins l;
	public Logins getLogins() {
		if (l==null) {
			l=new Logins();
			
		}
		return l;
	}
	
	Hotellogin h;
	public Hotellogin getHotellogin() {
		if (h==null) {
			h=new Hotellogin();
			
		}
		return h;
	}
	SearchHotel s;
	public SearchHotel getSearchHotel() {
		if (s==null) {
			s=new SearchHotel();
			
		}
		return s;
	}
	BookHotel b;
	public BookHotel getBookHotel() {
		if (b==null) {
			b=new BookHotel();
			
		}
		return b;
	}
}
