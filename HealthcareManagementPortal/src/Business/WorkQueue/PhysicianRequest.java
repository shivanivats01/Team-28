/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author shivanivats
 */
public class PhysicianRequest extends WorkRequest {
    
    private String timeDate;

    
    public String getTime() {
        return timeDate;
    }

    public void setTime(String time) {
        this.timeDate = time;
    }
    
}
