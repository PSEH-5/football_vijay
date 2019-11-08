package com.sapient.football;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FootBallHolder {

    private Long id;
    private String football;

    public FootBallHolder() {
    }

    public Long getId() {
        return this.id;
    }

    public String getQuote() {
        return this.football;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setQuote(String football) {
        this.football = football;
    }

    @Override
    public String toString() {
        return "FootBallHolder{" +
                "id=" + id +
                ", football='" + football + '\'' +
                '}';
    }
}
