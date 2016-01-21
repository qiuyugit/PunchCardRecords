/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package punchcardrecords.common;

import org.apache.commons.lang3.StringUtils;

/**
 * 版本信息
 * @author qiuyu
 */
public class SoftVersion {
    private String name;
    private String version;
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    public SoftVersion(String name, String version, String time){
        this.name = StringUtils.isNotBlank(name)?name:"智汇方象(青岛)考勤统计软件（2016）";
        this.version = StringUtils.isNotBlank(version)?version:"1.2.8";
        this.time = StringUtils.isNotBlank(time)?time:"2016-1-14 15:19:54";
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
