package com.ktdsInstructor.common.mongo.dao;

import com.ktdsInstructor.common.mongo.schema.LogSchema;

public interface LogDao {

	public void writeLog(LogSchema loggerVO);
}
