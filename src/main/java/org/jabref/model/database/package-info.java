/**
 * Provides classes for managing bibliographic databases in JabRef.
 *
 * This package includes the core class {@link org.jabref.model.database.BibDatabase} representing a
 * bibliography database. It also introduces {@link org.jabref.model.database.BibDatabaseContext},
 * which encapsulates everything related to a BIB file, such as the database, metadata, file paths, and synchronization.
 *
 * Additionally, it contains the {@link org.jabref.model.database.BibDatabaseMode} enum, which represents the possible modes
 * of a BibDatabase, including BibTeX and biblatex.
 *
 * The utility class {@link org.jabref.model.database.BibDatabases} provides methods for handling collections of
 * {@link org.jabref.model.entry.BibEntry} instances, such as purging entries with no fields set.
 *
 * The {@link org.jabref.model.database.KeyChangeListener} class offers functionality to listen for changes to citation keys
 * in a BibDatabase and update links accordingly.
 *
 * The {@link org.jabref.model.database.KeyCollisionException} is an exception thrown in case of a collision
 * when trying to update or add an entry with a duplicate citation key.
 *
 * Example of creating a new database context:
 * <pre>{@code
 * BibDatabaseContext context = new BibDatabaseContext(new BibDatabase());
 * }</pre>
 *
 * Example of purging empty entries from a collection:
 * <pre>{@code
 * List<BibEntry> cleanedEntries = BibDatabases.purgeEmptyEntries(entries);
 * }</pre>
 *
 * Example of using the KeyChangeListener to automatically update links when citation keys change:
 * <pre>{@code
 * BibDatabase database = new BibDatabase();
 * KeyChangeListener keyChangeListener = new KeyChangeListener(database);
 * // Register the keyChangeListener with an event bus
 * eventBus.register(keyChangeListener);
 * }</pre>
 *
 * Example of handling key collisions:
 * <pre>{@code
 * try {
 *     // Code that may result in a key collision
 * } catch (KeyCollisionException e) {
 *     // Handle the key collision, e.g., by prompting the user to choose a new key
 *     String conflictingKey = e.getId();
 *     // ...
 * }
 * }</pre>
 */
package org.jabref.model.database;


