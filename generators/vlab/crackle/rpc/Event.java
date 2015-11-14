/// ------------------------------------------------------------------
/// Copyright (c) from 1996 Vincent Risi
/// 
/// All rights reserved.
/// This program and the accompanying materials are made available
/// under the terms of the Common Public License v1.0
/// which accompanies this distribution and is available at
/// http://www.eclipse.org/legal/cpl-v10.html
/// Contributors:
///    Vincent Risi
/// ------------------------------------------------------------------
package vlab.crackle.rpc;

public class Event
{
  static private int eventNo;

  public static synchronized int getEventNo()
  {
    return eventNo;
  }

  public static synchronized void setEventNo(int eventNo)
  {
    Event.eventNo = eventNo;
  }
}
