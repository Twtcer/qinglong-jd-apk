package cn.moon.ql.data.model;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
public class QLEnvData {

    private Integer id;
    private String name;
    private String value;
    private String remarks;
    private Integer status;

    public QLEnvData(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public QLEnvData(String name, String value, String remarks) {
        this.name = name;
        this.value = value;
        this.remarks = remarks;
    }

    public QLEnvData(Integer id, String name, String value) {
        this.id = id;
        this.name = name;
        this.value = value;
    }

    public QLEnvData(Integer id, String name, String value, String remarks, Integer status) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.remarks = remarks;
        this.status = status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setStatus(Integer s) {
        this.status = s;
    }

    public Integer getStatus() {
        return status;
    }
  
    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getRemarks() {
        return remarks;
    }

    public String toJsonString() throws JSONException {
        return toJson().toString();
    }

    public JSONObject toJson() throws JSONException {
        JSONObject jo = new JSONObject();
        if (this.id != null) {
            jo.put("id", this.id);
        }
        jo.put("name", this.name);
        jo.put("value", this.value);
        jo.put("remarks", this.remarks);
        return jo;
    }
}