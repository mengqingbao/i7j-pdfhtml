package com.itextpdf.html2pdf.css;

import com.itextpdf.html2pdf.ExtendedHtmlConversionITextTest;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.html2pdf.LogMessageConstant;
import com.itextpdf.test.LogLevelConstants;
import com.itextpdf.test.annotations.LogMessage;
import com.itextpdf.test.annotations.LogMessages;
import com.itextpdf.test.annotations.type.IntegrationTest;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(IntegrationTest.class)
public class LinearGradientTest extends ExtendedHtmlConversionITextTest {

    public static final String sourceFolder = "./src/test/resources/com/itextpdf/html2pdf/css/LinearGradientTest/";
    public static final String destinationFolder = "./target/test/com/itextpdf/html2pdf/css/LinearGradientTest/";

    @BeforeClass
    public static void beforeClass() {
        createOrClearDestinationFolder(destinationFolder);
    }

    @Test
    public void backgroundLinearGradientTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("background-linear-gradient", sourceFolder, destinationFolder);
    }

    @Test
    public void backgroundLinearGradientWithTransformTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("background-linear-gradient-with-transform", sourceFolder, destinationFolder);
    }

    @Test
    public void backgroundImageLinearGradientTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("background-image-linear-gradient", sourceFolder, destinationFolder);
    }

    // TODO: DEVSIX-3595 update cmp_ after fix and remove log message expectation
    @Test
    @LogMessages(messages = {
            @LogMessage(messageTemplate = LogMessageConstant.INVALID_GRADIENT_DECLARATION, count = 3, logLevel = LogLevelConstants.WARN)
    })
    public void backgroundImageLinearGradientWithAnglesTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("background-image-angles-linear-gradient", sourceFolder, destinationFolder);
    }

    // TODO: DEVSIX-3596 update cmp_ after fix and remove log message expectation
    @Test
    @LogMessages(messages = {
            @LogMessage(messageTemplate = LogMessageConstant.INVALID_GRADIENT_DECLARATION, count = 5, logLevel = LogLevelConstants.WARN)
    })
    public void backgroundImageLinearGradientWithMetricsTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("background-image-metrics-linear-gradient", sourceFolder, destinationFolder);
    }

    @Test
    public void backgroundImageLinearGradientWithOffsetsTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("background-image-offsets-linear-gradient", sourceFolder, destinationFolder);
    }

    @Test
    public void backgroundRepeatingLinearGradientTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("background-repeating-linear-gradient", sourceFolder, destinationFolder);
    }

    @Test
    public void backgroundImageRepeatingLinearGradientTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("background-image-repeating-linear-gradient", sourceFolder, destinationFolder);
    }

    // TODO: DEVSIX-3595 update cmp_ after fix and remove log message expectation
    @Test
    @LogMessages(messages = {
            @LogMessage(messageTemplate = LogMessageConstant.INVALID_GRADIENT_DECLARATION, count = 3, logLevel = LogLevelConstants.WARN)
    })
    public void backgroundImageRepeatingLinearGradientWithAnglesTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("background-image-angles-repeating-linear-gradient", sourceFolder, destinationFolder);
    }

    // TODO: DEVSIX-3596 update cmp_ after fix and remove log message expectation
    @Test
    @LogMessages(messages = {
            @LogMessage(messageTemplate = LogMessageConstant.INVALID_GRADIENT_DECLARATION, count = 5, logLevel = LogLevelConstants.WARN)
    })
    public void backgroundImageRepeatingLinearGradientWithMetricsTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("background-image-metrics-repeating-linear-gradient", sourceFolder, destinationFolder);
    }

    @Test
    public void backgroundImageRepeatingLinearGradientWithOffsetsTest() throws IOException, InterruptedException {
        convertToPdfAndCompare("background-image-offsets-repeating-linear-gradient", sourceFolder, destinationFolder);
    }

    @Test
    @LogMessages(messages = {
            @LogMessage(messageTemplate = LogMessageConstant.INVALID_GRADIENT_DECLARATION, logLevel = LogLevelConstants.WARN)
    })
    public void invalidFirstArgumentTest() throws IOException {
        convertHtmlWithGradient(
                "linear-gradient(not-angle-or-color, orange 100pt, red 150pt, green 200pt, blue 250pt)");
    }

    @Test
    @LogMessages(messages = {
            @LogMessage(messageTemplate = LogMessageConstant.INVALID_GRADIENT_DECLARATION, logLevel = LogLevelConstants.WARN)
    })
    public void invalidToSideTest0() throws IOException {
        convertHtmlWithGradient("linear-gradient(to , orange 100pt, red 150pt, green 200pt, blue 250pt)");
    }

    @Test
    @LogMessages(messages = {
            @LogMessage(messageTemplate = LogMessageConstant.INVALID_GRADIENT_DECLARATION, logLevel = LogLevelConstants.WARN)
    })
    public void invalidToSideTest1() throws IOException {
        convertHtmlWithGradient("linear-gradient(to, orange 100pt, red 150pt, green 200pt, blue 250pt)");
    }

    @Test
    @LogMessages(messages = {
            @LogMessage(messageTemplate = LogMessageConstant.INVALID_GRADIENT_DECLARATION, logLevel = LogLevelConstants.WARN)
    })
    public void invalidToSideTest2() throws IOException {
        convertHtmlWithGradient("linear-gradient(to left left, orange 100pt, red 150pt, green 200pt, blue 250pt)");
    }

    @Test
    @LogMessages(messages = {
            @LogMessage(messageTemplate = LogMessageConstant.INVALID_GRADIENT_DECLARATION, logLevel = LogLevelConstants.WARN)
    })
    public void invalidToSideTest3() throws IOException {
        convertHtmlWithGradient("linear-gradient(to bottom top, orange 100pt, red 150pt, green 200pt, blue 250pt)");
    }

    @Test
    @LogMessages(messages = {
            @LogMessage(messageTemplate = LogMessageConstant.INVALID_GRADIENT_DECLARATION, logLevel = LogLevelConstants.WARN)
    })
    public void invalidToSideTest4() throws IOException {
        convertHtmlWithGradient("linear-gradient(to left right, orange 100pt, red 150pt, green 200pt, blue 250pt)");
    }

    @Test
    @LogMessages(messages = {
            @LogMessage(messageTemplate = LogMessageConstant.INVALID_GRADIENT_DECLARATION, logLevel = LogLevelConstants.WARN)
    })
    public void invalidToSideTest5() throws IOException {
        convertHtmlWithGradient(
                "linear-gradient(to top right right, orange 100pt, red 150pt, green 200pt, blue 250pt)");
    }

    @Test
    @LogMessages(messages = {
            @LogMessage(messageTemplate = LogMessageConstant.INVALID_GRADIENT_DECLARATION, logLevel = LogLevelConstants.WARN)
    })
    public void invalidColorWithThreeOffsetsValueTest() throws IOException {
        convertHtmlWithGradient("linear-gradient(red, orange 20pt 30pt 100pt, green 200pt, blue 250pt)");
    }

    @Test
    @LogMessages(messages = {
            @LogMessage(messageTemplate = LogMessageConstant.INVALID_GRADIENT_DECLARATION, logLevel = LogLevelConstants.WARN)
    })
    public void invalidColorOffsetValueTest() throws IOException {
        convertHtmlWithGradient("linear-gradient(red, orange 20, green 200pt, blue 250pt)");
    }

    @Test
    @LogMessages(messages = {
            @LogMessage(messageTemplate = LogMessageConstant.INVALID_GRADIENT_DECLARATION, logLevel = LogLevelConstants.WARN)
    })
    public void invalidMultipleHintsInARowValueTest() throws IOException {
        convertHtmlWithGradient("linear-gradient(red, orange, 20%, 30%, green 200pt, blue 250pt)");
    }

    @Test
    @LogMessages(messages = {
            @LogMessage(messageTemplate = LogMessageConstant.INVALID_GRADIENT_DECLARATION, logLevel = LogLevelConstants.WARN)
    })
    public void invalidMultipleHintsInARowWithoutCommaValueTest() throws IOException {
        convertHtmlWithGradient("linear-gradient(red, orange, 20% 30%, green 200pt, blue 250pt)");
    }

    @Test
    @LogMessages(messages = {
            @LogMessage(messageTemplate = LogMessageConstant.INVALID_GRADIENT_DECLARATION, logLevel = LogLevelConstants.WARN)
    })
    public void invalidFirstElementIsAHintValueTest() throws IOException {
        convertHtmlWithGradient("linear-gradient(5%, red, orange, 30%, green 200pt, blue 250pt)");
    }

    @Test
    @LogMessages(messages = {
            @LogMessage(messageTemplate = LogMessageConstant.INVALID_GRADIENT_DECLARATION, logLevel = LogLevelConstants.WARN)
    })
    public void invalidLastElementIsAHintValueTest() throws IOException {
        convertHtmlWithGradient("linear-gradient(red, orange, 30%, green 200pt, blue 250pt, 120%)");
    }

    private void convertHtmlWithGradient(String gradientString) throws IOException {
        String html = "<!DOCTYPE html><html lang=\"en\">"
                + "<head><meta charset=\"UTF-8\"></head><body><div style=\"background-image: "
                + gradientString + ";\"></div></body></html>";
        try (OutputStream os = new ByteArrayOutputStream()) {
            HtmlConverter.convertToPdf(html, os);
        }
    }
}
