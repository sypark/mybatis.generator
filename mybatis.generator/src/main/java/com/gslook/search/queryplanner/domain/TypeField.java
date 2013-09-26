package com.gslook.search.queryplanner.domain;

import java.util.Date;

public class TypeField {
    private Integer typeFieldSeq;

    private Date regDtm;

    private String regrId;

    private Date modDtm;

    private String modrId;

    private Integer typeSeq;

    private String fieldNm;

    private String type;

    private String store;

    private String indexAttr;

    private String indexOptions;

    private String ignoreMalformed;

    private String includeInAll;

    private String indexAnalyzer;

    private String searchAnalyzer;

    private String termVector;

    private String omitNorms;

    public Integer getTypeFieldSeq() {
        return typeFieldSeq;
    }

    public void setTypeFieldSeq(Integer typeFieldSeq) {
        this.typeFieldSeq = typeFieldSeq;
    }

    public Date getRegDtm() {
        return regDtm;
    }

    public void setRegDtm(Date regDtm) {
        this.regDtm = regDtm;
    }

    public String getRegrId() {
        return regrId;
    }

    public void setRegrId(String regrId) {
        this.regrId = regrId == null ? null : regrId.trim();
    }

    public Date getModDtm() {
        return modDtm;
    }

    public void setModDtm(Date modDtm) {
        this.modDtm = modDtm;
    }

    public String getModrId() {
        return modrId;
    }

    public void setModrId(String modrId) {
        this.modrId = modrId == null ? null : modrId.trim();
    }

    public Integer getTypeSeq() {
        return typeSeq;
    }

    public void setTypeSeq(Integer typeSeq) {
        this.typeSeq = typeSeq;
    }

    public String getFieldNm() {
        return fieldNm;
    }

    public void setFieldNm(String fieldNm) {
        this.fieldNm = fieldNm == null ? null : fieldNm.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store == null ? null : store.trim();
    }

    public String getIndexAttr() {
        return indexAttr;
    }

    public void setIndexAttr(String indexAttr) {
        this.indexAttr = indexAttr == null ? null : indexAttr.trim();
    }

    public String getIndexOptions() {
        return indexOptions;
    }

    public void setIndexOptions(String indexOptions) {
        this.indexOptions = indexOptions == null ? null : indexOptions.trim();
    }

    public String getIgnoreMalformed() {
        return ignoreMalformed;
    }

    public void setIgnoreMalformed(String ignoreMalformed) {
        this.ignoreMalformed = ignoreMalformed == null ? null : ignoreMalformed.trim();
    }

    public String getIncludeInAll() {
        return includeInAll;
    }

    public void setIncludeInAll(String includeInAll) {
        this.includeInAll = includeInAll == null ? null : includeInAll.trim();
    }

    public String getIndexAnalyzer() {
        return indexAnalyzer;
    }

    public void setIndexAnalyzer(String indexAnalyzer) {
        this.indexAnalyzer = indexAnalyzer == null ? null : indexAnalyzer.trim();
    }

    public String getSearchAnalyzer() {
        return searchAnalyzer;
    }

    public void setSearchAnalyzer(String searchAnalyzer) {
        this.searchAnalyzer = searchAnalyzer == null ? null : searchAnalyzer.trim();
    }

    public String getTermVector() {
        return termVector;
    }

    public void setTermVector(String termVector) {
        this.termVector = termVector == null ? null : termVector.trim();
    }

    public String getOmitNorms() {
        return omitNorms;
    }

    public void setOmitNorms(String omitNorms) {
        this.omitNorms = omitNorms == null ? null : omitNorms.trim();
    }
}