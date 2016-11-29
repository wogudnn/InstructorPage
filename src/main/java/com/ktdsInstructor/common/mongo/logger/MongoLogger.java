package com.ktdsInstructor.common.mongo.logger;

import org.slf4j.Logger;

import com.ktdsuniv.common.mongo.logger.MongoDBLogger;

public class MongoLogger {

	private static MongoDBLogger mongoDBLogger;

	public void setMongoDBLogger(MongoDBLogger mongoDBLogger) {
		MongoLogger.mongoDBLogger = mongoDBLogger;
	}

	public static MongoDBLogger getMongoDBLogger(Logger logger) {
		MongoLogger.mongoDBLogger.setLogger(logger);
		return MongoLogger.mongoDBLogger;
	}

}
