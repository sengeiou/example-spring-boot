/*
 * This file is generated by jOOQ.
*/
package com.lesson.boot.docs.jooq.generator.tables.daos;


import com.lesson.boot.docs.jooq.generator.tables.TActivity;
import com.lesson.boot.docs.jooq.generator.tables.records.TActivityRecord;

import java.util.List;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
@Repository
public class TActivityDao extends DAOImpl<TActivityRecord, com.lesson.boot.docs.jooq.generator.tables.pojos.TActivity, Long> {

    /**
     * Create a new TActivityDao without any configuration
     */
    public TActivityDao() {
        super(TActivity.T_ACTIVITY, com.lesson.boot.docs.jooq.generator.tables.pojos.TActivity.class);
    }

    /**
     * Create a new TActivityDao with an attached configuration
     */
    @Autowired
    public TActivityDao(Configuration configuration) {
        super(TActivity.T_ACTIVITY, com.lesson.boot.docs.jooq.generator.tables.pojos.TActivity.class, configuration);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Long getId(com.lesson.boot.docs.jooq.generator.tables.pojos.TActivity object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<com.lesson.boot.docs.jooq.generator.tables.pojos.TActivity> fetchById(Long... values) {
        return fetch(TActivity.T_ACTIVITY.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public com.lesson.boot.docs.jooq.generator.tables.pojos.TActivity fetchOneById(Long value) {
        return fetchOne(TActivity.T_ACTIVITY.ID, value);
    }

    /**
     * Fetch records that have <code>banner_url IN (values)</code>
     */
    public List<com.lesson.boot.docs.jooq.generator.tables.pojos.TActivity> fetchByBannerUrl(String... values) {
        return fetch(TActivity.T_ACTIVITY.BANNER_URL, values);
    }

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    public List<com.lesson.boot.docs.jooq.generator.tables.pojos.TActivity> fetchByName(String... values) {
        return fetch(TActivity.T_ACTIVITY.NAME, values);
    }

    /**
     * Fetch records that have <code>sequence IN (values)</code>
     */
    public List<com.lesson.boot.docs.jooq.generator.tables.pojos.TActivity> fetchBySequence(Integer... values) {
        return fetch(TActivity.T_ACTIVITY.SEQUENCE, values);
    }

    /**
     * Fetch records that have <code>url IN (values)</code>
     */
    public List<com.lesson.boot.docs.jooq.generator.tables.pojos.TActivity> fetchByUrl(String... values) {
        return fetch(TActivity.T_ACTIVITY.URL, values);
    }

    /**
     * Fetch records that have <code>begin_time IN (values)</code>
     */
    public List<com.lesson.boot.docs.jooq.generator.tables.pojos.TActivity> fetchByBeginTime(Long... values) {
        return fetch(TActivity.T_ACTIVITY.BEGIN_TIME, values);
    }

    /**
     * Fetch records that have <code>end_time IN (values)</code>
     */
    public List<com.lesson.boot.docs.jooq.generator.tables.pojos.TActivity> fetchByEndTime(Long... values) {
        return fetch(TActivity.T_ACTIVITY.END_TIME, values);
    }

    /**
     * Fetch records that have <code>status IN (values)</code>
     */
    public List<com.lesson.boot.docs.jooq.generator.tables.pojos.TActivity> fetchByStatus(Byte... values) {
        return fetch(TActivity.T_ACTIVITY.STATUS, values);
    }

    /**
     * Fetch records that have <code>type IN (values)</code>
     */
    public List<com.lesson.boot.docs.jooq.generator.tables.pojos.TActivity> fetchByType(Byte... values) {
        return fetch(TActivity.T_ACTIVITY.TYPE, values);
    }

    /**
     * Fetch records that have <code>country_id IN (values)</code>
     */
    public List<com.lesson.boot.docs.jooq.generator.tables.pojos.TActivity> fetchByCountryId(Long... values) {
        return fetch(TActivity.T_ACTIVITY.COUNTRY_ID, values);
    }

    /**
     * Fetch records that have <code>app_version IN (values)</code>
     */
    public List<com.lesson.boot.docs.jooq.generator.tables.pojos.TActivity> fetchByAppVersion(Integer... values) {
        return fetch(TActivity.T_ACTIVITY.APP_VERSION, values);
    }
}