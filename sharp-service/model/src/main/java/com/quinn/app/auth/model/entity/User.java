package com.quinn.app.auth.model.entity;


import com.quinn.Base;

/**
 * @author Quinn
 * @date 2018/1/15
 */
public class User extends Base{


        private String id;
        private String name;
        private String mobile;
        private String idcard;
        private Integer gender;
        private String address;

        public String getId() {
            return id;
        }
        public void setId (String id) {
            this.id = id;
        }
        public String getName() {
            return name;
        }
        public void setName (String name) {
            this.name = name;
        }
        public String getMobile() {
            return mobile;
        }
        public void setMobile (String mobile) {
            this.mobile = mobile;
        }
        public String getIdcard() {
            return idcard;
        }
        public void setIdcard (String idcard) {
            this.idcard = idcard;
        }
        public Integer getGender() {
            return gender;
        }
        public void setGender (Integer gender) {
            this.gender = gender;
        }
        public String getAddress() {
            return address;
        }
        public void setAddress (String address) {
            this.address = address;
        }


        @Override
        public String toString() {
            return "{" +
            "\"id\":" + "\"" + id + "\"" + "," +
            "\"name\":" + "\"" + name + "\"" + "," +
            "\"mobile\":" + "\"" + mobile + "\"" + "," +
            "\"idcard\":" + "\"" + idcard + "\"" + "," +
            "\"gender\":" + "\"" + gender + "\"" + "," +
            "\"address\":" + "\"" + address + "\"" +
            '}';
        }
}
