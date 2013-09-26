package com.gslook.search.indexer.dao.mapper;

import com.gslook.search.queryplanner.domain.GsEsDocumentRankingGroup;
import com.gslook.search.queryplanner.domain.GsEsDocumentRankingGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface GsEsDocumentRankingGroupMapper {
    int countByExample(GsEsDocumentRankingGroupExample example);

    int deleteByExample(GsEsDocumentRankingGroupExample example);

    @Delete({
        "delete from gs_es_document_ranking_group",
        "where DOC_ID = #{docId,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String docId);

    @Insert({
        "insert into gs_es_document_ranking_group (DOC_ID, KEYWORDS, ",
        "REG_DATE)",
        "values (#{docId,jdbcType=VARCHAR}, #{keywords,jdbcType=VARCHAR}, ",
        "#{regDate,jdbcType=TIMESTAMP})"
    })
    int insert(GsEsDocumentRankingGroup record);

    int insertSelective(GsEsDocumentRankingGroup record);

    List<GsEsDocumentRankingGroup> selectByExample(GsEsDocumentRankingGroupExample example);

    @Select({
        "select",
        "DOC_ID, KEYWORDS, REG_DATE",
        "from gs_es_document_ranking_group",
        "where DOC_ID = #{docId,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    GsEsDocumentRankingGroup selectByPrimaryKey(String docId);

    int updateByExampleSelective(@Param("record") GsEsDocumentRankingGroup record, @Param("example") GsEsDocumentRankingGroupExample example);

    int updateByExample(@Param("record") GsEsDocumentRankingGroup record, @Param("example") GsEsDocumentRankingGroupExample example);

    int updateByPrimaryKeySelective(GsEsDocumentRankingGroup record);

    @Update({
        "update gs_es_document_ranking_group",
        "set KEYWORDS = #{keywords,jdbcType=VARCHAR},",
          "REG_DATE = #{regDate,jdbcType=TIMESTAMP}",
        "where DOC_ID = #{docId,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(GsEsDocumentRankingGroup record);
}