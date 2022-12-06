package com.xworkz.exception.events;

import java.awt.AWTError;
import java.awt.FontFormatException;
import java.awt.color.ProfileDataException;
import java.awt.datatransfer.MimeTypeParseException;
import java.awt.geom.IllegalPathStateException;
import java.awt.image.ImagingOpException;
import java.awt.image.RasterFormatException;
import java.io.IOError;
import java.io.IOException;
import java.lang.annotation.AnnotationFormatError;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.annotation.IncompleteAnnotationException;
import java.lang.instrument.IllegalClassFormatException;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.charset.CoderMalfunctionError;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemNotFoundException;
import java.rmi.AlreadyBoundException;
import java.rmi.NotBoundException;
import java.rmi.activation.ActivationException;
import java.security.GeneralSecurityException;
import java.security.ProviderException;
import java.security.acl.AclNotFoundException;
import java.security.acl.LastOwnerException;
import java.security.cert.CertificateException;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.IllformedLocaleException;
import java.util.MissingResourceException;
import java.util.NoSuchElementException;
import java.util.ServiceConfigurationError;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.prefs.BackingStoreException;
import java.util.prefs.InvalidPreferencesFormatException;
import java.util.zip.DataFormatException;
import java.util.zip.ZipError;

import javax.lang.model.type.MirroredTypesException;
import javax.management.BadAttributeValueExpException;
import javax.management.BadBinaryOpValueExpException;
import javax.management.BadStringOperationException;
import javax.management.IntrospectionException;
import javax.management.InvalidApplicationException;
import javax.management.JMException;
import javax.management.JMRuntimeException;
import javax.naming.NamingException;
import javax.security.auth.DestroyFailedException;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.text.BadLocationException;
import javax.swing.tree.ExpandVetoException;
import javax.swing.undo.CannotRedoException;
import javax.swing.undo.CannotUndoException;
import javax.xml.bind.DataBindingException;
import javax.xml.bind.JAXBException;
import javax.xml.crypto.KeySelectorException;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.NoSuchMechanismException;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.transform.TransformerFactoryConfigurationError;

import org.omg.CORBA.portable.ApplicationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.events.EventException;
import org.w3c.dom.ls.LSException;

public class Events {
	public void name1() {
		System.out.println("Runtime Exception method");
		throw new RuntimeException();
	}

	public void age2() {
		System.out.println("Runtime Exception method");
		throw new AnnotationTypeMismatchException(null, null);
	}

	public void email3() {
		System.out.println("Runtime Exception method");
		throw new ArithmeticException();
	}

	public void chair4() {
		System.out.println("Runtime Exception method");
		throw new ArrayStoreException();
	}

	public void phone5() {
		System.out.println("Runtime Exception method");
		throw new BufferOverflowException();

	}

	public void laptop6() {
		System.out.println("Runtime Exception method");
		throw new BufferUnderflowException();

	}

	public void pen7() {
		System.out.println("Runtime Exception method");
		throw new CannotRedoException();
	}

	public void eyes8() {
		System.out.println("Runtime Exception method");
		throw new CannotUndoException();
	}

	public void legs9() {
		System.out.println("Runtime Exception method");
		throw new ClassCastException();
	}

	public void ram10() {
		System.out.println("Runtime Exception method");
		throw new ConcurrentModificationException();
	}

	public void charger11() {
		System.out.println("Runtime Exception method");
		throw new DataBindingException(null);
	}
//	public void hands12() {
//		throw new DOMException(0, null);
//	}

	public void hands12() {
		System.out.println("Runtime Exception method");
		throw new EmptyStackException();
	}

	public void happy13() {
		System.out.println("Runtime Exception method");
		throw new EnumConstantNotPresentException(null, null);
	}

	public void learning14() {
		System.out.println("Runtime Exception method");
//		throw new EventException(0, null);
		throw new FileSystemAlreadyExistsException();
	}

	public void bag15() {
		System.out.println("Runtime Exception method");
		throw new FileSystemNotFoundException();
	}

	public void watch16() {
		System.out.println("Runtime Exception method");
		throw new IllegalArgumentException();

	}

	public void table17() {
		System.out.println("Runtime Exception method");
		throw new IllegalMonitorStateException();
	}

	public void paper18() {
		System.out.println("Runtime Exception method");
		throw new IllegalPathStateException();
	}

	public void match19() {
		System.out.println("Runtime Exception method");
		throw new IllegalStateException();
	}

	public void water20() {
		System.out.println("Runtime Exception method");
		throw new IllformedLocaleException();
	}

	public void solid21() {
		System.out.println("Runtime Exception method");
		throw new ImagingOpException(null);
	}

	public void bottle22() {
		System.out.println("Runtime Exception method");
		throw new IncompleteAnnotationException(null, null);
	}

	public void box23() {
		System.out.println("Runtime Exception method");
		throw new IndexOutOfBoundsException();
	}

	public void tree24() {
		System.out.println("Runtime Exception method");
		throw new JMRuntimeException();
	}

	public void door25() {
		System.out.println("Runtime Exception method");
		throw new MalformedParameterizedTypeException();
	}

	public void car26() {
		System.out.println("Runtime Exception method");
		throw new MirroredTypesException(null);
	}

	public void bike27() {
		System.out.println("Runtime Exception method");
		throw new MissingResourceException(null, null, null);
	}

	public void van28() {
		System.out.println("Runtime Exception method");
		throw new NegativeArraySizeException();
	}

	public void bus29() {
		System.out.println("Runtime Exception method");
		throw new NoSuchElementException();
	}

	public void cycle30() {
		System.out.println("Runtime Exception method");
		throw new NoSuchMechanismException();
	}

	public void glass31() {
		System.out.println("Runtime Exception method");
		throw new NullPointerException();
	}

	public void Tv32() {
		System.out.println("Runtime Exception method");
		throw new ProfileDataException(null);
	}

	public void bulp33() {
		System.out.println("Runtime Exception method");
		throw new ProviderException();
	}

	public void chain34() {
		System.out.println("Runtime Exception method");
		throw new RasterFormatException(null);
	}

	public void cake35() {
		System.out.println("Runtime Exception method");
		throw new RejectedExecutionException();
	}

	public void exception1() throws Exception {
		System.out.println("Exception method");
		throw new Exception();
	}

	public void aclNotFoundException2() throws AclNotFoundException {
		System.out.println("Exception method");
		throw new AclNotFoundException();
	}

	public void activationException3() throws ActivationException {
		System.out.println("Exception method");
		throw new ActivationException();
	}

	public void alreadyBoundException4() throws AlreadyBoundException {
		System.out.println("Exception method");
		throw new AlreadyBoundException();
	}

	public void applicationException5() throws ApplicationException {
		System.out.println("Exception method");
		throw new ApplicationException(null, null);
	}

	public void badAttributeValueExpException6() throws BadAttributeValueExpException {
		System.out.println("Exception method");
		throw new BadAttributeValueExpException(getClass());
	}

	public void badBinaryOpValueExpException7() throws BadBinaryOpValueExpException {
		System.out.println("Exception method");
		throw new BadBinaryOpValueExpException(null);
	}

	public void badLocationException8() throws BadLocationException {
		System.out.println("Exception method");
		throw new BadLocationException(null, 0);
	}

	public void badStringOperationException9() throws BadStringOperationException {
		System.out.println("Exception method");
		throw new BadStringOperationException(null);
	}

	public void brokenBarrierException10() throws BrokenBarrierException {
		System.out.println("Exception method");
		throw new BrokenBarrierException();
	}

	public void certificateException11() throws CertificateException {
		System.out.println("Exception method");
		throw new CertificateException();

	}

	public void cloneNotSupportedException12() throws CloneNotSupportedException {
		System.out.println("Exception method");
		throw new CloneNotSupportedException();
	}

	public void dataFormatException13() throws DataFormatException {
		System.out.println("Exception method");
		throw new DataFormatException();
	}

	public void datatypeConfigurationException14() throws DatatypeConfigurationException {
		System.out.println("Exception method");
		throw new DatatypeConfigurationException();
	}

	public void destroyFailedException15() throws DestroyFailedException {
		System.out.println("Exception method");
		throw new DestroyFailedException();
	}

	public void executionException16() throws ExecutionException {
		System.out.println("Exception method");
		throw new ExecutionException(null);
	}

	public void expandVetoException17() throws ExpandVetoException {
		System.out.println("Exception method");
		throw new ExpandVetoException(null);
	}

	public void fontFormatException18() throws FontFormatException {
		System.out.println("Exception method");
		throw new FontFormatException(null);
	}

	public void generalSecurityException19() throws GeneralSecurityException {
		System.out.println("Exception method");
		throw new GeneralSecurityException();
	}

	public void illegalClassFormatException20() throws IllegalClassFormatException {
		System.out.println("Exception method");
		throw new IllegalClassFormatException();
	}

	public void interruptedException21() throws InterruptedException {
		System.out.println("Exception method");
		throw new InterruptedException();
	}

	public void introspectionException22() throws IntrospectionException {
		System.out.println("Exception method");
		throw new IntrospectionException();
	}

	public void invalidApplicationException23() throws InvalidApplicationException {
		System.out.println("Exception method");
		throw new InvalidApplicationException(getClass());
	}

	public void invalidMidiDataException24() throws InvalidMidiDataException {
		System.out.println("Exception method");
		throw new InvalidMidiDataException();
	}

	public void iOException25() throws IOException {
		System.out.println("Exception method");
		throw new IOException();
	}

	public void jMException26() throws JMException {
		System.out.println("Exception method");
		throw new JMException();
	}

	public void keySelectorException27() throws KeySelectorException {
		System.out.println("Exception method");
		throw new KeySelectorException();
	}

	public void lastOwnerException28() throws LastOwnerException {
		System.out.println("Exception method");
		throw new LastOwnerException();
	}

	public void lineUnavailableException29() throws LineUnavailableException {
		System.out.println("Exception method");
		throw new LineUnavailableException();
	}

	public void marshalException30() throws MarshalException {
		System.out.println("Exception method");
		throw new MarshalException();
	}

	public void midiUnavailableException31() throws MidiUnavailableException {
		System.out.println("Exception method");
		throw new MidiUnavailableException();
	}

	public void mimeTypeParseException32() throws MimeTypeParseException {
		System.out.println("Exception method");
		throw new MimeTypeParseException();
	}

	public void mimeTypeParseException33() throws MimeTypeParseException {
		System.out.println("Exception method");
		throw new MimeTypeParseException();
	}

	public void namingException34() throws NamingException {
		System.out.println("Exception method");
		throw new NamingException();
	}

	public void notBoundException35() throws NotBoundException {
		System.out.println("Exception method");
		throw new NotBoundException();
	}

	public void error1() throws Error {
		System.out.println("Error method");
		throw new Error();
	}

	public void assertionError2() throws AssertionError {
		System.out.println("Error method");
		throw new AssertionError();
	}

	public void aWTError3() throws AWTError {
		System.out.println("Error method");
		throw new AWTError(null);
	}

	public void coderMalfunctionError4() throws CoderMalfunctionError {
		System.out.println("Error method");
		throw new CoderMalfunctionError(null);
	}

	public void factoryConfigurationError5() throws FactoryConfigurationError {
		System.out.println("Error method");
		throw new FactoryConfigurationError();
	}

	public void iOError6() throws IOError {
		System.out.println("Error method");
		throw new IOError(null);
	}

	public void linkageError7() throws LinkageError {
		System.out.println("Error method");
		throw new LinkageError();
	}

	public void serviceConfigurationError8() throws ServiceConfigurationError {
		System.out.println("Error method");
		throw new ServiceConfigurationError(null);
	}

	public void threadDeath9() throws ThreadDeath {
		System.out.println("Error method");
		throw new ThreadDeath();
	}

	public void transformerFactoryConfigurationError10() throws TransformerFactoryConfigurationError {
		System.out.println("Error method");
		throw new TransformerFactoryConfigurationError();
	}

	public void virtualMachineError11() throws VirtualMachineError {
		System.out.println("Error method");
		throw new VirtualMachineError() {
		};

	}

	public void internalError12() throws InternalError {
		System.out.println("Error method");
		throw new InternalError();
	}

	public void outOfMemoryError13() throws OutOfMemoryError {
		System.out.println("Error method");
		throw new OutOfMemoryError();
	}

	public void stackOverflowError14() throws StackOverflowError {
		System.out.println("Error method");
		throw new StackOverflowError();
	}

	public void unknownError15() throws UnknownError {
		System.out.println("Error method");
		throw new UnknownError();
	}

	public void bootstrapMethodError16() throws BootstrapMethodError {
		System.out.println("Error method");
		throw new BootstrapMethodError();
	}

	public void classCircularityError17() throws ClassCircularityError {
		System.out.println("Error method");
		throw new ClassCircularityError();
	}

	public void classFormatError18() throws ClassFormatError {
		System.out.println("Error method");
		throw new ClassFormatError();
	}

	public void exceptionInInitializerError19() throws ExceptionInInitializerError {
		System.out.println("Error method");
		throw new ExceptionInInitializerError();
	}

	public void incompatibleClassChangeError20() throws IncompatibleClassChangeError {
		System.out.println("Error method");
		throw new IncompatibleClassChangeError();
	}

	public void noClassDefFoundError21() throws NoClassDefFoundError {
		System.out.println("Error method");
		throw new NoClassDefFoundError();
	}

	public void unsatisfiedLinkError22() throws UnsatisfiedLinkError {
		System.out.println("Error method");
		throw new UnsatisfiedLinkError();
	}

	public void verifyError23() throws VerifyError {
		System.out.println("Error method");
		throw new VerifyError();
	}

	public void annotationFormatError24() throws AnnotationFormatError {
		System.out.println("Error method");
		throw new AnnotationFormatError(null, null);
	}

	public void zipError25() throws ZipError {
		System.out.println("Error method");
		throw new ZipError(null);
	}

	public void genericSignatureFormatError26() throws GenericSignatureFormatError {
		System.out.println("Error method");
		throw new GenericSignatureFormatError();
	}

	public void unsupportedClassVersionError27() throws UnsupportedClassVersionError {
		System.out.println("Error method");
		throw new UnsupportedClassVersionError();
	}

	public void abstractMethodError28() throws AbstractMethodError {
		System.out.println("Error method");
		throw new AbstractMethodError();
	}

	public void illegalAccessError29() throws IllegalAccessError {
		System.out.println("Error method");
		throw new IllegalAccessError();
	}

	public void noSuchFieldError30() throws NoSuchFieldError {
		System.out.println("Error method");
		throw new NoSuchFieldError();
	}
}
