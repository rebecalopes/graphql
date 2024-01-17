package com.rebeca.graphql.resolver;

import com.rebeca.graphql.domain.BankAccount;
import com.rebeca.graphql.domain.Currency;
import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public record BankAccountResolver() implements GraphQLQueryResolver {

    public BankAccount bankAccount(UUID id) {
        log.info("Retrieving bank account id: {}", id);
        return BankAccount.builder()
                .id(id)
                .currency(Currency.USD)
                .name("Rebeca")
                .build();
    }
}
