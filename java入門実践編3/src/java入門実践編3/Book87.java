package java������H��3;
import java.util.Date;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class Book87 implements Comparable<Book87>,Cloneable{
	private String title;
	private Date publishDate;
	private String comment;
	public int hashCode(){
		int r=1;
		r=31*r+publishDate.hashCode();
		r=31*r+title.hashCode();
		return r;
	}
	public boolean equals(Object o){
		return EqualsBuilder.reflectionEquals(this,o);

	}
	@Override
	public int compareTo(Book87 o) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		return 0;
	}
System.out.println("\r\n"+ToString.Builder.Reflection.ToSoString


}

