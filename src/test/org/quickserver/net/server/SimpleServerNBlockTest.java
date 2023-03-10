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

package test.org.quickserver.net.server;

import org.quickserver.net.server.*;
import org.quickserver.net.client.*;
import junit.framework.TestCase;
import junit.framework.AssertionFailedError;
import java.util.logging.*;
import org.quickserver.util.xmlreader.QuickServerConfig;

/**
 * JUnit test cases for QuickServer
 */
public class SimpleServerNBlockTest extends SimpleServerBlockTest {
	public SimpleServerNBlockTest(String name) {
        super(name);
    }

	public boolean getServerMode() {
		return true;
	}
	public String getServerName() {
		return "SimpleServerNBlockTest";
	}
}