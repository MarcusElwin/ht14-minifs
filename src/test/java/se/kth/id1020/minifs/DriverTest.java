/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.kth.id1020.minifs;

import junit.framework.TestCase;

/**
 *
 */
public class DriverTest extends TestCase {
  
  class TestFs implements FileSystem {

    public void mkdir(String path) {
    }

    public void touch(String path) {
    }

    public void append(String path, String data) {
    }

    public String lsByTime(String path) {
      return "";
    }

    public String lsByName(String path) {
      return "";
    }

    public String du(String path) {
      return "";
    }

    public String cat(String path) {
      return "";
    }
    
  }
  
  public void testMain() {
    FileSystem fs = new TestFs();
    System.out.println(Driver.processCmdFile(fs, "/tmp/cmds.txt"));
  }
    
  public void testProcessCmd() {
    FileSystem fs = new TestFs();
    assertEquals(Driver.processCmd(fs, "mkdir /home/jim"), null);
  }
}
