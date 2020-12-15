package com.halla.holdings.config;

import org.hibernate.dialect.Oracle12cDialect;
import org.hibernate.tool.schema.extract.spi.SequenceInformationExtractor;

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
