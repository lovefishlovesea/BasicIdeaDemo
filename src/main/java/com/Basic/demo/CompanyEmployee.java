package com.Basic.demo;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by hanzhaoyang on 17/5/12.
 */
@Component
@ConfigurationProperties(prefix="com.kfit")
public class CompanyEmployee {
     private EmployeInfo employhan;
     private EmployeInfo employliu;

    public EmployeInfo getEmployhan() {
        return employhan;
    }

    public void setEmployhan(EmployeInfo employhan) {
        this.employhan = employhan;
    }

    public EmployeInfo getEmployliu() {
        return employliu;
    }

    public void setEmployliu(EmployeInfo employliu) {
        this.employliu = employliu;
    }

    @Override
    public String toString() {
        return "CompanyEmployee{" +
                "employhan=" + employhan +
                ", employliu=" + employliu +
                '}';
    }
    public static class EmployeInfo
    {
        @NotNull
        private String name;
        @Max(value=20)
        @Min(value=19)
        private int age;
        @NotEmpty
        private String gender;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "EmployeInfo{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }
}
