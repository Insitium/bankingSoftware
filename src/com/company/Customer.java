package com.company;

public class Customer {
        protected String firstName;
        protected String lastName;
        protected String location;
        protected String username;
        protected int password;
        protected  String name;
        public Customer(){};

        public Customer(String firstName, String lastName, String location, String username, int password){
            this.firstName = firstName;
            this.lastName = lastName;
            this.location = location;
            this.username = username;
            this.password = password;
        }




    public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public int getPassword() {
            return password;
        }

        public void setPassword(int password) {
            this.password = password;
        }

        @Override
        public String toString() {
            return "Customer{"+"firstName="+firstName+", lastName="+lastName+", location="+location+", username="+username+", password="+password+'}';
        }
    }


