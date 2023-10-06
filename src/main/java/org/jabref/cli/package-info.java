/**
 * The org.jabref.cli package provides classes for the command-line interface (CLI) of JabRef.
 *
 * Classes in this package can import, export, and manage BibTeX files using command-line options.
 * The main class, {@link org.jabref.cli.JabRefCLI}, serves as the entry point
 * for executing various commands related to JabRef from the command line. Additionally, the {@link org.jabref.cli.AuxCommandLine}
 * and {@link org.jabref.cli.ArgumentProcessor} classes provide functionality for processing AUX files,
 * exporting matches, and handling various command-line arguments, respectively.
 *
 * Usage Examples:
 *
 * 1. Importing a BibTeX file with JabRefCLI:
 * <pre>{@code
 * JabRefCLI jabRefCLI = new JabRefCLI(args);
 * if (jabRefCLI.isBibtexImport()) {
 *     String bibtexFile = jabRefCLI.getBibtexImport();
 *     // Perform further processing with the imported BibTeX file
 * }
 * }</pre>
 *
 * 2. Processing an AUX file with AuxCommandLine:
 * <pre>{@code
 * AuxCommandLine auxCommandLine = new AuxCommandLine(auxFile, database);
 * BibDatabase subDatabase = auxCommandLine.perform();
 * // Perform further processing with the extracted BibTeX entries
 * }</pre>
 *
 * 3. Handling command-line arguments with ArgumentProcessor:
 * <pre>{@code
 * ArgumentProcessor argumentProcessor = new ArgumentProcessor(args, Mode.INITIAL_START, preferencesService);
 * List<ParserResult> parserResults = argumentProcessor.getParserResults();
 * // Perform further processing based on the obtained parser results
 * }</pre>
 */
package org.jabref.cli;
