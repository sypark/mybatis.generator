package com.gslook.search.indexer.dao.mapper;

import com.gslook.search.queryplanner.domain.TypeField;
import com.gslook.search.queryplanner.domain.TypeFieldExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

public interface TypeFieldMapper {
    int countByExample(TypeFieldExample example);

    int deleteByExample(TypeFieldExample example);

    @Delete({
        "delete from type_field",
        "where type_field_seq = #{typeFieldSeq,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer typeFieldSeq);

    @Insert({
        "insert into type_field (reg_dtm, regr_id, ",
        "mod_dtm, modr_id, ",
        "type_seq, field_nm, ",
        "type, store, index_attr, ",
        "index_options, ignore_malformed, ",
        "include_in_all, index_analyzer, ",
        "search_analyzer, term_vector, ",
        "omit_norms)",
        "values (#{regDtm,jdbcType=TIMESTAMP}, #{regrId,jdbcType=VARCHAR}, ",
        "#{modDtm,jdbcType=TIMESTAMP}, #{modrId,jdbcType=VARCHAR}, ",
        "#{typeSeq,jdbcType=INTEGER}, #{fieldNm,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=VARCHAR}, #{store,jdbcType=VARCHAR}, #{indexAttr,jdbcType=VARCHAR}, ",
        "#{indexOptions,jdbcType=VARCHAR}, #{ignoreMalformed,jdbcType=VARCHAR}, ",
        "#{includeInAll,jdbcType=VARCHAR}, #{indexAnalyzer,jdbcType=VARCHAR}, ",
        "#{searchAnalyzer,jdbcType=VARCHAR}, #{termVector,jdbcType=VARCHAR}, ",
        "#{omitNorms,jdbcType=VARCHAR})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="typeFieldSeq", before=false, resultType=Integer.class)
    int insert(TypeField record);

    int insertSelective(TypeField record);

    List<TypeField> selectByExample(TypeFieldExample example);

    @Select({
        "select",
        "type_field_seq, reg_dtm, regr_id, mod_dtm, modr_id, type_seq, field_nm, type, ",
        "store, index_attr, index_options, ignore_malformed, include_in_all, index_analyzer, ",
        "search_analyzer, term_vector, omit_norms",
        "from type_field",
        "where type_field_seq = #{typeFieldSeq,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    TypeField selectByPrimaryKey(Integer typeFieldSeq);

    int updateByExampleSelective(@Param("record") TypeField record, @Param("example") TypeFieldExample example);

    int updateByExample(@Param("record") TypeField record, @Param("example") TypeFieldExample example);

    int updateByPrimaryKeySelective(TypeField record);

    @Update({
        "update type_field",
        "set reg_dtm = #{regDtm,jdbcType=TIMESTAMP},",
          "regr_id = #{regrId,jdbcType=VARCHAR},",
          "mod_dtm = #{modDtm,jdbcType=TIMESTAMP},",
          "modr_id = #{modrId,jdbcType=VARCHAR},",
          "type_seq = #{typeSeq,jdbcType=INTEGER},",
          "field_nm = #{fieldNm,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "store = #{store,jdbcType=VARCHAR},",
          "index_attr = #{indexAttr,jdbcType=VARCHAR},",
          "index_options = #{indexOptions,jdbcType=VARCHAR},",
          "ignore_malformed = #{ignoreMalformed,jdbcType=VARCHAR},",
          "include_in_all = #{includeInAll,jdbcType=VARCHAR},",
          "index_analyzer = #{indexAnalyzer,jdbcType=VARCHAR},",
          "search_analyzer = #{searchAnalyzer,jdbcType=VARCHAR},",
          "term_vector = #{termVector,jdbcType=VARCHAR},",
          "omit_norms = #{omitNorms,jdbcType=VARCHAR}",
        "where type_field_seq = #{typeFieldSeq,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(TypeField record);
}