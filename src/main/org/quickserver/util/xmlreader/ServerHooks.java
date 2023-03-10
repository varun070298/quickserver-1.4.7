/*
 * This file is part of the QuickServer library 
 * Copyright (C) 2003-2005 QuickServer.org
 *
 * Use, modification, copying and distribution of this software is subject to
 * the terms and conditions of the GNU Lesser General Public License. 
 * You should have received a copy of the GNU LGP License along with this 
 * library; if not, you can download a copy from <http://www.quickserver.org/>.
 *
 * For questions, suggestions, bug-reports, enhancement-requests etc.
 * visit http://www.quickserver.org
 *
 */

package org.quickserver.util.xmlreader;

import java.util.*;

/**
 * This class encapsulate the Server Hooks. These are event listeners to 
 * the QuickServer.
 * The example xml is <pre>
	....
	&lt;server-hooks&gt;
		&lt;class-name&gt;package1.Class1&lt;/class-name&gt;
		&lt;class-name&gt;package1.Class2&lt;/class-name&gt;
	&lt;/server-hooks&gt;
	....
 </pre>
 * @see org.quickserver.net.ServerHook
 * @see org.quickserver.util.xmlreader.InitServerHooks
 * @author Akshathkumar Shetty
 * @since 1.3.3
 */
public class ServerHooks extends ArrayList {
	
	/**
	 * Addes the class to server hooks
	 */
	public void addClassName(String className) {
		if(className!=null && className.trim().length()!=0) {
			add(className.trim());
		}
	}

	/**
	 * Returns XML config of this class.
	 */
	public String toXML(String pad) {
		if(pad==null) pad="";
		StringBuffer sb = new StringBuffer();
		sb.append(pad+"<server-hooks>\n");
		Iterator iterator = iterator();
		while(iterator.hasNext()) {
			String classname = (String) iterator.next();
			sb.append(pad+"\t<class-name>"+classname+"</class-name>\n");
		}
		sb.append(pad+"</server-hooks>\n");
		return sb.toString();
	}
}
