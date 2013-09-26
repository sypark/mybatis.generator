package com.gslook.search.queryplanner.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TypeFieldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TypeFieldExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTypeFieldSeqIsNull() {
            addCriterion("type_field_seq is null");
            return (Criteria) this;
        }

        public Criteria andTypeFieldSeqIsNotNull() {
            addCriterion("type_field_seq is not null");
            return (Criteria) this;
        }

        public Criteria andTypeFieldSeqEqualTo(Integer value) {
            addCriterion("type_field_seq =", value, "typeFieldSeq");
            return (Criteria) this;
        }

        public Criteria andTypeFieldSeqNotEqualTo(Integer value) {
            addCriterion("type_field_seq <>", value, "typeFieldSeq");
            return (Criteria) this;
        }

        public Criteria andTypeFieldSeqGreaterThan(Integer value) {
            addCriterion("type_field_seq >", value, "typeFieldSeq");
            return (Criteria) this;
        }

        public Criteria andTypeFieldSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_field_seq >=", value, "typeFieldSeq");
            return (Criteria) this;
        }

        public Criteria andTypeFieldSeqLessThan(Integer value) {
            addCriterion("type_field_seq <", value, "typeFieldSeq");
            return (Criteria) this;
        }

        public Criteria andTypeFieldSeqLessThanOrEqualTo(Integer value) {
            addCriterion("type_field_seq <=", value, "typeFieldSeq");
            return (Criteria) this;
        }

        public Criteria andTypeFieldSeqIn(List<Integer> values) {
            addCriterion("type_field_seq in", values, "typeFieldSeq");
            return (Criteria) this;
        }

        public Criteria andTypeFieldSeqNotIn(List<Integer> values) {
            addCriterion("type_field_seq not in", values, "typeFieldSeq");
            return (Criteria) this;
        }

        public Criteria andTypeFieldSeqBetween(Integer value1, Integer value2) {
            addCriterion("type_field_seq between", value1, value2, "typeFieldSeq");
            return (Criteria) this;
        }

        public Criteria andTypeFieldSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("type_field_seq not between", value1, value2, "typeFieldSeq");
            return (Criteria) this;
        }

        public Criteria andRegDtmIsNull() {
            addCriterion("reg_dtm is null");
            return (Criteria) this;
        }

        public Criteria andRegDtmIsNotNull() {
            addCriterion("reg_dtm is not null");
            return (Criteria) this;
        }

        public Criteria andRegDtmEqualTo(Date value) {
            addCriterion("reg_dtm =", value, "regDtm");
            return (Criteria) this;
        }

        public Criteria andRegDtmNotEqualTo(Date value) {
            addCriterion("reg_dtm <>", value, "regDtm");
            return (Criteria) this;
        }

        public Criteria andRegDtmGreaterThan(Date value) {
            addCriterion("reg_dtm >", value, "regDtm");
            return (Criteria) this;
        }

        public Criteria andRegDtmGreaterThanOrEqualTo(Date value) {
            addCriterion("reg_dtm >=", value, "regDtm");
            return (Criteria) this;
        }

        public Criteria andRegDtmLessThan(Date value) {
            addCriterion("reg_dtm <", value, "regDtm");
            return (Criteria) this;
        }

        public Criteria andRegDtmLessThanOrEqualTo(Date value) {
            addCriterion("reg_dtm <=", value, "regDtm");
            return (Criteria) this;
        }

        public Criteria andRegDtmIn(List<Date> values) {
            addCriterion("reg_dtm in", values, "regDtm");
            return (Criteria) this;
        }

        public Criteria andRegDtmNotIn(List<Date> values) {
            addCriterion("reg_dtm not in", values, "regDtm");
            return (Criteria) this;
        }

        public Criteria andRegDtmBetween(Date value1, Date value2) {
            addCriterion("reg_dtm between", value1, value2, "regDtm");
            return (Criteria) this;
        }

        public Criteria andRegDtmNotBetween(Date value1, Date value2) {
            addCriterion("reg_dtm not between", value1, value2, "regDtm");
            return (Criteria) this;
        }

        public Criteria andRegrIdIsNull() {
            addCriterion("regr_id is null");
            return (Criteria) this;
        }

        public Criteria andRegrIdIsNotNull() {
            addCriterion("regr_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegrIdEqualTo(String value) {
            addCriterion("regr_id =", value, "regrId");
            return (Criteria) this;
        }

        public Criteria andRegrIdNotEqualTo(String value) {
            addCriterion("regr_id <>", value, "regrId");
            return (Criteria) this;
        }

        public Criteria andRegrIdGreaterThan(String value) {
            addCriterion("regr_id >", value, "regrId");
            return (Criteria) this;
        }

        public Criteria andRegrIdGreaterThanOrEqualTo(String value) {
            addCriterion("regr_id >=", value, "regrId");
            return (Criteria) this;
        }

        public Criteria andRegrIdLessThan(String value) {
            addCriterion("regr_id <", value, "regrId");
            return (Criteria) this;
        }

        public Criteria andRegrIdLessThanOrEqualTo(String value) {
            addCriterion("regr_id <=", value, "regrId");
            return (Criteria) this;
        }

        public Criteria andRegrIdLike(String value) {
            addCriterion("regr_id like", value, "regrId");
            return (Criteria) this;
        }

        public Criteria andRegrIdNotLike(String value) {
            addCriterion("regr_id not like", value, "regrId");
            return (Criteria) this;
        }

        public Criteria andRegrIdIn(List<String> values) {
            addCriterion("regr_id in", values, "regrId");
            return (Criteria) this;
        }

        public Criteria andRegrIdNotIn(List<String> values) {
            addCriterion("regr_id not in", values, "regrId");
            return (Criteria) this;
        }

        public Criteria andRegrIdBetween(String value1, String value2) {
            addCriterion("regr_id between", value1, value2, "regrId");
            return (Criteria) this;
        }

        public Criteria andRegrIdNotBetween(String value1, String value2) {
            addCriterion("regr_id not between", value1, value2, "regrId");
            return (Criteria) this;
        }

        public Criteria andModDtmIsNull() {
            addCriterion("mod_dtm is null");
            return (Criteria) this;
        }

        public Criteria andModDtmIsNotNull() {
            addCriterion("mod_dtm is not null");
            return (Criteria) this;
        }

        public Criteria andModDtmEqualTo(Date value) {
            addCriterion("mod_dtm =", value, "modDtm");
            return (Criteria) this;
        }

        public Criteria andModDtmNotEqualTo(Date value) {
            addCriterion("mod_dtm <>", value, "modDtm");
            return (Criteria) this;
        }

        public Criteria andModDtmGreaterThan(Date value) {
            addCriterion("mod_dtm >", value, "modDtm");
            return (Criteria) this;
        }

        public Criteria andModDtmGreaterThanOrEqualTo(Date value) {
            addCriterion("mod_dtm >=", value, "modDtm");
            return (Criteria) this;
        }

        public Criteria andModDtmLessThan(Date value) {
            addCriterion("mod_dtm <", value, "modDtm");
            return (Criteria) this;
        }

        public Criteria andModDtmLessThanOrEqualTo(Date value) {
            addCriterion("mod_dtm <=", value, "modDtm");
            return (Criteria) this;
        }

        public Criteria andModDtmIn(List<Date> values) {
            addCriterion("mod_dtm in", values, "modDtm");
            return (Criteria) this;
        }

        public Criteria andModDtmNotIn(List<Date> values) {
            addCriterion("mod_dtm not in", values, "modDtm");
            return (Criteria) this;
        }

        public Criteria andModDtmBetween(Date value1, Date value2) {
            addCriterion("mod_dtm between", value1, value2, "modDtm");
            return (Criteria) this;
        }

        public Criteria andModDtmNotBetween(Date value1, Date value2) {
            addCriterion("mod_dtm not between", value1, value2, "modDtm");
            return (Criteria) this;
        }

        public Criteria andModrIdIsNull() {
            addCriterion("modr_id is null");
            return (Criteria) this;
        }

        public Criteria andModrIdIsNotNull() {
            addCriterion("modr_id is not null");
            return (Criteria) this;
        }

        public Criteria andModrIdEqualTo(String value) {
            addCriterion("modr_id =", value, "modrId");
            return (Criteria) this;
        }

        public Criteria andModrIdNotEqualTo(String value) {
            addCriterion("modr_id <>", value, "modrId");
            return (Criteria) this;
        }

        public Criteria andModrIdGreaterThan(String value) {
            addCriterion("modr_id >", value, "modrId");
            return (Criteria) this;
        }

        public Criteria andModrIdGreaterThanOrEqualTo(String value) {
            addCriterion("modr_id >=", value, "modrId");
            return (Criteria) this;
        }

        public Criteria andModrIdLessThan(String value) {
            addCriterion("modr_id <", value, "modrId");
            return (Criteria) this;
        }

        public Criteria andModrIdLessThanOrEqualTo(String value) {
            addCriterion("modr_id <=", value, "modrId");
            return (Criteria) this;
        }

        public Criteria andModrIdLike(String value) {
            addCriterion("modr_id like", value, "modrId");
            return (Criteria) this;
        }

        public Criteria andModrIdNotLike(String value) {
            addCriterion("modr_id not like", value, "modrId");
            return (Criteria) this;
        }

        public Criteria andModrIdIn(List<String> values) {
            addCriterion("modr_id in", values, "modrId");
            return (Criteria) this;
        }

        public Criteria andModrIdNotIn(List<String> values) {
            addCriterion("modr_id not in", values, "modrId");
            return (Criteria) this;
        }

        public Criteria andModrIdBetween(String value1, String value2) {
            addCriterion("modr_id between", value1, value2, "modrId");
            return (Criteria) this;
        }

        public Criteria andModrIdNotBetween(String value1, String value2) {
            addCriterion("modr_id not between", value1, value2, "modrId");
            return (Criteria) this;
        }

        public Criteria andTypeSeqIsNull() {
            addCriterion("type_seq is null");
            return (Criteria) this;
        }

        public Criteria andTypeSeqIsNotNull() {
            addCriterion("type_seq is not null");
            return (Criteria) this;
        }

        public Criteria andTypeSeqEqualTo(Integer value) {
            addCriterion("type_seq =", value, "typeSeq");
            return (Criteria) this;
        }

        public Criteria andTypeSeqNotEqualTo(Integer value) {
            addCriterion("type_seq <>", value, "typeSeq");
            return (Criteria) this;
        }

        public Criteria andTypeSeqGreaterThan(Integer value) {
            addCriterion("type_seq >", value, "typeSeq");
            return (Criteria) this;
        }

        public Criteria andTypeSeqGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_seq >=", value, "typeSeq");
            return (Criteria) this;
        }

        public Criteria andTypeSeqLessThan(Integer value) {
            addCriterion("type_seq <", value, "typeSeq");
            return (Criteria) this;
        }

        public Criteria andTypeSeqLessThanOrEqualTo(Integer value) {
            addCriterion("type_seq <=", value, "typeSeq");
            return (Criteria) this;
        }

        public Criteria andTypeSeqIn(List<Integer> values) {
            addCriterion("type_seq in", values, "typeSeq");
            return (Criteria) this;
        }

        public Criteria andTypeSeqNotIn(List<Integer> values) {
            addCriterion("type_seq not in", values, "typeSeq");
            return (Criteria) this;
        }

        public Criteria andTypeSeqBetween(Integer value1, Integer value2) {
            addCriterion("type_seq between", value1, value2, "typeSeq");
            return (Criteria) this;
        }

        public Criteria andTypeSeqNotBetween(Integer value1, Integer value2) {
            addCriterion("type_seq not between", value1, value2, "typeSeq");
            return (Criteria) this;
        }

        public Criteria andFieldNmIsNull() {
            addCriterion("field_nm is null");
            return (Criteria) this;
        }

        public Criteria andFieldNmIsNotNull() {
            addCriterion("field_nm is not null");
            return (Criteria) this;
        }

        public Criteria andFieldNmEqualTo(String value) {
            addCriterion("field_nm =", value, "fieldNm");
            return (Criteria) this;
        }

        public Criteria andFieldNmNotEqualTo(String value) {
            addCriterion("field_nm <>", value, "fieldNm");
            return (Criteria) this;
        }

        public Criteria andFieldNmGreaterThan(String value) {
            addCriterion("field_nm >", value, "fieldNm");
            return (Criteria) this;
        }

        public Criteria andFieldNmGreaterThanOrEqualTo(String value) {
            addCriterion("field_nm >=", value, "fieldNm");
            return (Criteria) this;
        }

        public Criteria andFieldNmLessThan(String value) {
            addCriterion("field_nm <", value, "fieldNm");
            return (Criteria) this;
        }

        public Criteria andFieldNmLessThanOrEqualTo(String value) {
            addCriterion("field_nm <=", value, "fieldNm");
            return (Criteria) this;
        }

        public Criteria andFieldNmLike(String value) {
            addCriterion("field_nm like", value, "fieldNm");
            return (Criteria) this;
        }

        public Criteria andFieldNmNotLike(String value) {
            addCriterion("field_nm not like", value, "fieldNm");
            return (Criteria) this;
        }

        public Criteria andFieldNmIn(List<String> values) {
            addCriterion("field_nm in", values, "fieldNm");
            return (Criteria) this;
        }

        public Criteria andFieldNmNotIn(List<String> values) {
            addCriterion("field_nm not in", values, "fieldNm");
            return (Criteria) this;
        }

        public Criteria andFieldNmBetween(String value1, String value2) {
            addCriterion("field_nm between", value1, value2, "fieldNm");
            return (Criteria) this;
        }

        public Criteria andFieldNmNotBetween(String value1, String value2) {
            addCriterion("field_nm not between", value1, value2, "fieldNm");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andStoreIsNull() {
            addCriterion("store is null");
            return (Criteria) this;
        }

        public Criteria andStoreIsNotNull() {
            addCriterion("store is not null");
            return (Criteria) this;
        }

        public Criteria andStoreEqualTo(String value) {
            addCriterion("store =", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotEqualTo(String value) {
            addCriterion("store <>", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreGreaterThan(String value) {
            addCriterion("store >", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreGreaterThanOrEqualTo(String value) {
            addCriterion("store >=", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreLessThan(String value) {
            addCriterion("store <", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreLessThanOrEqualTo(String value) {
            addCriterion("store <=", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreLike(String value) {
            addCriterion("store like", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotLike(String value) {
            addCriterion("store not like", value, "store");
            return (Criteria) this;
        }

        public Criteria andStoreIn(List<String> values) {
            addCriterion("store in", values, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotIn(List<String> values) {
            addCriterion("store not in", values, "store");
            return (Criteria) this;
        }

        public Criteria andStoreBetween(String value1, String value2) {
            addCriterion("store between", value1, value2, "store");
            return (Criteria) this;
        }

        public Criteria andStoreNotBetween(String value1, String value2) {
            addCriterion("store not between", value1, value2, "store");
            return (Criteria) this;
        }

        public Criteria andIndexAttrIsNull() {
            addCriterion("index_attr is null");
            return (Criteria) this;
        }

        public Criteria andIndexAttrIsNotNull() {
            addCriterion("index_attr is not null");
            return (Criteria) this;
        }

        public Criteria andIndexAttrEqualTo(String value) {
            addCriterion("index_attr =", value, "indexAttr");
            return (Criteria) this;
        }

        public Criteria andIndexAttrNotEqualTo(String value) {
            addCriterion("index_attr <>", value, "indexAttr");
            return (Criteria) this;
        }

        public Criteria andIndexAttrGreaterThan(String value) {
            addCriterion("index_attr >", value, "indexAttr");
            return (Criteria) this;
        }

        public Criteria andIndexAttrGreaterThanOrEqualTo(String value) {
            addCriterion("index_attr >=", value, "indexAttr");
            return (Criteria) this;
        }

        public Criteria andIndexAttrLessThan(String value) {
            addCriterion("index_attr <", value, "indexAttr");
            return (Criteria) this;
        }

        public Criteria andIndexAttrLessThanOrEqualTo(String value) {
            addCriterion("index_attr <=", value, "indexAttr");
            return (Criteria) this;
        }

        public Criteria andIndexAttrLike(String value) {
            addCriterion("index_attr like", value, "indexAttr");
            return (Criteria) this;
        }

        public Criteria andIndexAttrNotLike(String value) {
            addCriterion("index_attr not like", value, "indexAttr");
            return (Criteria) this;
        }

        public Criteria andIndexAttrIn(List<String> values) {
            addCriterion("index_attr in", values, "indexAttr");
            return (Criteria) this;
        }

        public Criteria andIndexAttrNotIn(List<String> values) {
            addCriterion("index_attr not in", values, "indexAttr");
            return (Criteria) this;
        }

        public Criteria andIndexAttrBetween(String value1, String value2) {
            addCriterion("index_attr between", value1, value2, "indexAttr");
            return (Criteria) this;
        }

        public Criteria andIndexAttrNotBetween(String value1, String value2) {
            addCriterion("index_attr not between", value1, value2, "indexAttr");
            return (Criteria) this;
        }

        public Criteria andIndexOptionsIsNull() {
            addCriterion("index_options is null");
            return (Criteria) this;
        }

        public Criteria andIndexOptionsIsNotNull() {
            addCriterion("index_options is not null");
            return (Criteria) this;
        }

        public Criteria andIndexOptionsEqualTo(String value) {
            addCriterion("index_options =", value, "indexOptions");
            return (Criteria) this;
        }

        public Criteria andIndexOptionsNotEqualTo(String value) {
            addCriterion("index_options <>", value, "indexOptions");
            return (Criteria) this;
        }

        public Criteria andIndexOptionsGreaterThan(String value) {
            addCriterion("index_options >", value, "indexOptions");
            return (Criteria) this;
        }

        public Criteria andIndexOptionsGreaterThanOrEqualTo(String value) {
            addCriterion("index_options >=", value, "indexOptions");
            return (Criteria) this;
        }

        public Criteria andIndexOptionsLessThan(String value) {
            addCriterion("index_options <", value, "indexOptions");
            return (Criteria) this;
        }

        public Criteria andIndexOptionsLessThanOrEqualTo(String value) {
            addCriterion("index_options <=", value, "indexOptions");
            return (Criteria) this;
        }

        public Criteria andIndexOptionsLike(String value) {
            addCriterion("index_options like", value, "indexOptions");
            return (Criteria) this;
        }

        public Criteria andIndexOptionsNotLike(String value) {
            addCriterion("index_options not like", value, "indexOptions");
            return (Criteria) this;
        }

        public Criteria andIndexOptionsIn(List<String> values) {
            addCriterion("index_options in", values, "indexOptions");
            return (Criteria) this;
        }

        public Criteria andIndexOptionsNotIn(List<String> values) {
            addCriterion("index_options not in", values, "indexOptions");
            return (Criteria) this;
        }

        public Criteria andIndexOptionsBetween(String value1, String value2) {
            addCriterion("index_options between", value1, value2, "indexOptions");
            return (Criteria) this;
        }

        public Criteria andIndexOptionsNotBetween(String value1, String value2) {
            addCriterion("index_options not between", value1, value2, "indexOptions");
            return (Criteria) this;
        }

        public Criteria andIgnoreMalformedIsNull() {
            addCriterion("ignore_malformed is null");
            return (Criteria) this;
        }

        public Criteria andIgnoreMalformedIsNotNull() {
            addCriterion("ignore_malformed is not null");
            return (Criteria) this;
        }

        public Criteria andIgnoreMalformedEqualTo(String value) {
            addCriterion("ignore_malformed =", value, "ignoreMalformed");
            return (Criteria) this;
        }

        public Criteria andIgnoreMalformedNotEqualTo(String value) {
            addCriterion("ignore_malformed <>", value, "ignoreMalformed");
            return (Criteria) this;
        }

        public Criteria andIgnoreMalformedGreaterThan(String value) {
            addCriterion("ignore_malformed >", value, "ignoreMalformed");
            return (Criteria) this;
        }

        public Criteria andIgnoreMalformedGreaterThanOrEqualTo(String value) {
            addCriterion("ignore_malformed >=", value, "ignoreMalformed");
            return (Criteria) this;
        }

        public Criteria andIgnoreMalformedLessThan(String value) {
            addCriterion("ignore_malformed <", value, "ignoreMalformed");
            return (Criteria) this;
        }

        public Criteria andIgnoreMalformedLessThanOrEqualTo(String value) {
            addCriterion("ignore_malformed <=", value, "ignoreMalformed");
            return (Criteria) this;
        }

        public Criteria andIgnoreMalformedLike(String value) {
            addCriterion("ignore_malformed like", value, "ignoreMalformed");
            return (Criteria) this;
        }

        public Criteria andIgnoreMalformedNotLike(String value) {
            addCriterion("ignore_malformed not like", value, "ignoreMalformed");
            return (Criteria) this;
        }

        public Criteria andIgnoreMalformedIn(List<String> values) {
            addCriterion("ignore_malformed in", values, "ignoreMalformed");
            return (Criteria) this;
        }

        public Criteria andIgnoreMalformedNotIn(List<String> values) {
            addCriterion("ignore_malformed not in", values, "ignoreMalformed");
            return (Criteria) this;
        }

        public Criteria andIgnoreMalformedBetween(String value1, String value2) {
            addCriterion("ignore_malformed between", value1, value2, "ignoreMalformed");
            return (Criteria) this;
        }

        public Criteria andIgnoreMalformedNotBetween(String value1, String value2) {
            addCriterion("ignore_malformed not between", value1, value2, "ignoreMalformed");
            return (Criteria) this;
        }

        public Criteria andIncludeInAllIsNull() {
            addCriterion("include_in_all is null");
            return (Criteria) this;
        }

        public Criteria andIncludeInAllIsNotNull() {
            addCriterion("include_in_all is not null");
            return (Criteria) this;
        }

        public Criteria andIncludeInAllEqualTo(String value) {
            addCriterion("include_in_all =", value, "includeInAll");
            return (Criteria) this;
        }

        public Criteria andIncludeInAllNotEqualTo(String value) {
            addCriterion("include_in_all <>", value, "includeInAll");
            return (Criteria) this;
        }

        public Criteria andIncludeInAllGreaterThan(String value) {
            addCriterion("include_in_all >", value, "includeInAll");
            return (Criteria) this;
        }

        public Criteria andIncludeInAllGreaterThanOrEqualTo(String value) {
            addCriterion("include_in_all >=", value, "includeInAll");
            return (Criteria) this;
        }

        public Criteria andIncludeInAllLessThan(String value) {
            addCriterion("include_in_all <", value, "includeInAll");
            return (Criteria) this;
        }

        public Criteria andIncludeInAllLessThanOrEqualTo(String value) {
            addCriterion("include_in_all <=", value, "includeInAll");
            return (Criteria) this;
        }

        public Criteria andIncludeInAllLike(String value) {
            addCriterion("include_in_all like", value, "includeInAll");
            return (Criteria) this;
        }

        public Criteria andIncludeInAllNotLike(String value) {
            addCriterion("include_in_all not like", value, "includeInAll");
            return (Criteria) this;
        }

        public Criteria andIncludeInAllIn(List<String> values) {
            addCriterion("include_in_all in", values, "includeInAll");
            return (Criteria) this;
        }

        public Criteria andIncludeInAllNotIn(List<String> values) {
            addCriterion("include_in_all not in", values, "includeInAll");
            return (Criteria) this;
        }

        public Criteria andIncludeInAllBetween(String value1, String value2) {
            addCriterion("include_in_all between", value1, value2, "includeInAll");
            return (Criteria) this;
        }

        public Criteria andIncludeInAllNotBetween(String value1, String value2) {
            addCriterion("include_in_all not between", value1, value2, "includeInAll");
            return (Criteria) this;
        }

        public Criteria andIndexAnalyzerIsNull() {
            addCriterion("index_analyzer is null");
            return (Criteria) this;
        }

        public Criteria andIndexAnalyzerIsNotNull() {
            addCriterion("index_analyzer is not null");
            return (Criteria) this;
        }

        public Criteria andIndexAnalyzerEqualTo(String value) {
            addCriterion("index_analyzer =", value, "indexAnalyzer");
            return (Criteria) this;
        }

        public Criteria andIndexAnalyzerNotEqualTo(String value) {
            addCriterion("index_analyzer <>", value, "indexAnalyzer");
            return (Criteria) this;
        }

        public Criteria andIndexAnalyzerGreaterThan(String value) {
            addCriterion("index_analyzer >", value, "indexAnalyzer");
            return (Criteria) this;
        }

        public Criteria andIndexAnalyzerGreaterThanOrEqualTo(String value) {
            addCriterion("index_analyzer >=", value, "indexAnalyzer");
            return (Criteria) this;
        }

        public Criteria andIndexAnalyzerLessThan(String value) {
            addCriterion("index_analyzer <", value, "indexAnalyzer");
            return (Criteria) this;
        }

        public Criteria andIndexAnalyzerLessThanOrEqualTo(String value) {
            addCriterion("index_analyzer <=", value, "indexAnalyzer");
            return (Criteria) this;
        }

        public Criteria andIndexAnalyzerLike(String value) {
            addCriterion("index_analyzer like", value, "indexAnalyzer");
            return (Criteria) this;
        }

        public Criteria andIndexAnalyzerNotLike(String value) {
            addCriterion("index_analyzer not like", value, "indexAnalyzer");
            return (Criteria) this;
        }

        public Criteria andIndexAnalyzerIn(List<String> values) {
            addCriterion("index_analyzer in", values, "indexAnalyzer");
            return (Criteria) this;
        }

        public Criteria andIndexAnalyzerNotIn(List<String> values) {
            addCriterion("index_analyzer not in", values, "indexAnalyzer");
            return (Criteria) this;
        }

        public Criteria andIndexAnalyzerBetween(String value1, String value2) {
            addCriterion("index_analyzer between", value1, value2, "indexAnalyzer");
            return (Criteria) this;
        }

        public Criteria andIndexAnalyzerNotBetween(String value1, String value2) {
            addCriterion("index_analyzer not between", value1, value2, "indexAnalyzer");
            return (Criteria) this;
        }

        public Criteria andSearchAnalyzerIsNull() {
            addCriterion("search_analyzer is null");
            return (Criteria) this;
        }

        public Criteria andSearchAnalyzerIsNotNull() {
            addCriterion("search_analyzer is not null");
            return (Criteria) this;
        }

        public Criteria andSearchAnalyzerEqualTo(String value) {
            addCriterion("search_analyzer =", value, "searchAnalyzer");
            return (Criteria) this;
        }

        public Criteria andSearchAnalyzerNotEqualTo(String value) {
            addCriterion("search_analyzer <>", value, "searchAnalyzer");
            return (Criteria) this;
        }

        public Criteria andSearchAnalyzerGreaterThan(String value) {
            addCriterion("search_analyzer >", value, "searchAnalyzer");
            return (Criteria) this;
        }

        public Criteria andSearchAnalyzerGreaterThanOrEqualTo(String value) {
            addCriterion("search_analyzer >=", value, "searchAnalyzer");
            return (Criteria) this;
        }

        public Criteria andSearchAnalyzerLessThan(String value) {
            addCriterion("search_analyzer <", value, "searchAnalyzer");
            return (Criteria) this;
        }

        public Criteria andSearchAnalyzerLessThanOrEqualTo(String value) {
            addCriterion("search_analyzer <=", value, "searchAnalyzer");
            return (Criteria) this;
        }

        public Criteria andSearchAnalyzerLike(String value) {
            addCriterion("search_analyzer like", value, "searchAnalyzer");
            return (Criteria) this;
        }

        public Criteria andSearchAnalyzerNotLike(String value) {
            addCriterion("search_analyzer not like", value, "searchAnalyzer");
            return (Criteria) this;
        }

        public Criteria andSearchAnalyzerIn(List<String> values) {
            addCriterion("search_analyzer in", values, "searchAnalyzer");
            return (Criteria) this;
        }

        public Criteria andSearchAnalyzerNotIn(List<String> values) {
            addCriterion("search_analyzer not in", values, "searchAnalyzer");
            return (Criteria) this;
        }

        public Criteria andSearchAnalyzerBetween(String value1, String value2) {
            addCriterion("search_analyzer between", value1, value2, "searchAnalyzer");
            return (Criteria) this;
        }

        public Criteria andSearchAnalyzerNotBetween(String value1, String value2) {
            addCriterion("search_analyzer not between", value1, value2, "searchAnalyzer");
            return (Criteria) this;
        }

        public Criteria andTermVectorIsNull() {
            addCriterion("term_vector is null");
            return (Criteria) this;
        }

        public Criteria andTermVectorIsNotNull() {
            addCriterion("term_vector is not null");
            return (Criteria) this;
        }

        public Criteria andTermVectorEqualTo(String value) {
            addCriterion("term_vector =", value, "termVector");
            return (Criteria) this;
        }

        public Criteria andTermVectorNotEqualTo(String value) {
            addCriterion("term_vector <>", value, "termVector");
            return (Criteria) this;
        }

        public Criteria andTermVectorGreaterThan(String value) {
            addCriterion("term_vector >", value, "termVector");
            return (Criteria) this;
        }

        public Criteria andTermVectorGreaterThanOrEqualTo(String value) {
            addCriterion("term_vector >=", value, "termVector");
            return (Criteria) this;
        }

        public Criteria andTermVectorLessThan(String value) {
            addCriterion("term_vector <", value, "termVector");
            return (Criteria) this;
        }

        public Criteria andTermVectorLessThanOrEqualTo(String value) {
            addCriterion("term_vector <=", value, "termVector");
            return (Criteria) this;
        }

        public Criteria andTermVectorLike(String value) {
            addCriterion("term_vector like", value, "termVector");
            return (Criteria) this;
        }

        public Criteria andTermVectorNotLike(String value) {
            addCriterion("term_vector not like", value, "termVector");
            return (Criteria) this;
        }

        public Criteria andTermVectorIn(List<String> values) {
            addCriterion("term_vector in", values, "termVector");
            return (Criteria) this;
        }

        public Criteria andTermVectorNotIn(List<String> values) {
            addCriterion("term_vector not in", values, "termVector");
            return (Criteria) this;
        }

        public Criteria andTermVectorBetween(String value1, String value2) {
            addCriterion("term_vector between", value1, value2, "termVector");
            return (Criteria) this;
        }

        public Criteria andTermVectorNotBetween(String value1, String value2) {
            addCriterion("term_vector not between", value1, value2, "termVector");
            return (Criteria) this;
        }

        public Criteria andOmitNormsIsNull() {
            addCriterion("omit_norms is null");
            return (Criteria) this;
        }

        public Criteria andOmitNormsIsNotNull() {
            addCriterion("omit_norms is not null");
            return (Criteria) this;
        }

        public Criteria andOmitNormsEqualTo(String value) {
            addCriterion("omit_norms =", value, "omitNorms");
            return (Criteria) this;
        }

        public Criteria andOmitNormsNotEqualTo(String value) {
            addCriterion("omit_norms <>", value, "omitNorms");
            return (Criteria) this;
        }

        public Criteria andOmitNormsGreaterThan(String value) {
            addCriterion("omit_norms >", value, "omitNorms");
            return (Criteria) this;
        }

        public Criteria andOmitNormsGreaterThanOrEqualTo(String value) {
            addCriterion("omit_norms >=", value, "omitNorms");
            return (Criteria) this;
        }

        public Criteria andOmitNormsLessThan(String value) {
            addCriterion("omit_norms <", value, "omitNorms");
            return (Criteria) this;
        }

        public Criteria andOmitNormsLessThanOrEqualTo(String value) {
            addCriterion("omit_norms <=", value, "omitNorms");
            return (Criteria) this;
        }

        public Criteria andOmitNormsLike(String value) {
            addCriterion("omit_norms like", value, "omitNorms");
            return (Criteria) this;
        }

        public Criteria andOmitNormsNotLike(String value) {
            addCriterion("omit_norms not like", value, "omitNorms");
            return (Criteria) this;
        }

        public Criteria andOmitNormsIn(List<String> values) {
            addCriterion("omit_norms in", values, "omitNorms");
            return (Criteria) this;
        }

        public Criteria andOmitNormsNotIn(List<String> values) {
            addCriterion("omit_norms not in", values, "omitNorms");
            return (Criteria) this;
        }

        public Criteria andOmitNormsBetween(String value1, String value2) {
            addCriterion("omit_norms between", value1, value2, "omitNorms");
            return (Criteria) this;
        }

        public Criteria andOmitNormsNotBetween(String value1, String value2) {
            addCriterion("omit_norms not between", value1, value2, "omitNorms");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}