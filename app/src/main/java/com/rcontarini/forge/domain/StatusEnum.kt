package com.rcontarini.forge.domain

enum class StatusEnum(val description: String) {
    NOT_STARTED("NOT STARTED"),
    IN_PROGRESS("IN PROGRESS"),
    COMPLETED("COMPLETED"),
    SKIPPED("SKIPPED");

    companion object {
        fun fromDescription(description: String): StatusEnum? {
            return entries.find { it.description == description }
        }
    }
}