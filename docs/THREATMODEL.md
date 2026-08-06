# Threat Definition

## Purpose

Why this document exists.

## What is a Threat?

Definition in plain English.

## Threat Model

Field | Type | Description
----- | ---- | -----------
id | String | Unique identifier
name | String | Human-readable name
severity | Severity | LOW, MEDIUM, HIGH, CRITICAL
area | Area | Geographic area affected
guidance | String | What the user should do
reportedAt | Instant | When reported
expiresAt | Instant | When it becomes stale

## Fresh vs Stale

Explain the rules.

## Repository Contract

interface ThreatRepository {
    suspend fun getNearbyThreats(...): List<Threat>
}

Explain that callers don't know where threats come from.

## Alternatives Considered

### Option A
...

Rejected because...

### Option B
...

Rejected because...

## Consequences

What future tasks can assume because this decision exists.