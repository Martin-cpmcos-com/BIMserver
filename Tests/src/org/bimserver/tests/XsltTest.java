package org.bimserver.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.xml.transform.ErrorListener;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

public class XsltTest {
	public static void main(String[] args) {
		new XsltTest().start();
	}

	private void start() {
		Path xslt = Paths.get("../BimServer/xslt/_Report1.xhtml.xsl");
		TransformerFactory factory = TransformerFactory.newInstance();

		StreamSource xslStream = new StreamSource(xslt.toFile());
		try {
			Transformer transformer = factory.newTransformer(xslStream);
			transformer.setErrorListener(new ErrorListener() {

				@Override
				public void warning(TransformerException exception) throws TransformerException {
//					exception.printStackTrace();
				}

				@Override
				public void fatalError(TransformerException exception) throws TransformerException {
					exception.printStackTrace();
				}

				@Override
				public void error(TransformerException exception) throws TransformerException {
					exception.printStackTrace();
				}
			});

			StreamSource in = new StreamSource(new FileInputStream(TestFile.AC11_XML.getFile().toFile()));
			StreamResult out = new StreamResult(new FileOutputStream(Paths.get("test.txt").toFile()));
			transformer.transform(in, out);
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
	}
}
