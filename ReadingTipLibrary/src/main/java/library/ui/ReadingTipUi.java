/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.ui;
import library.domain.ReadingTipService;


public class ReadingTipUi {
    
    
    public void start() throws Exception{
      ReadingTipService ok = new ReadingTipService();
     
      String author = "kennedy";
      String title = "president";
      
      ok.createTip(author,title);
      
    }
    
}
