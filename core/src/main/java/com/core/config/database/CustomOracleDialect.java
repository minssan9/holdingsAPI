package com.core.config.database;

import org.hibernate.dialect.Oracle12cDialect;

@SuppressWarnings("unused")
public class CustomOracleDialect extends Oracle12cDialect {
    @Override
    public String getQuerySequencesString() {
        return "select * from user_sequences";
    }
//    @Override
//    public SequenceInformationExtractor getSequenceInformationExtractor() {
//        return AppSequenceInformationExtractor.INSTANCE;
//    }

}
