// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


/** \brief IEEE 754 half-precision floating point data type
 *
 * \details This struct is used for converting float to float16 and back
 * so the user could feed inputs and fetch outputs using these type.
 *
 * The size of the structure should align with uint16_t and one can freely cast
 * uint16_t buffers to/from Ort::Float16_t to feed and retrieve data.
 *
 * <pre>{@code {.unparsed}
 * // This example demonstrates converion from float to float16
 * constexpr float values[] = {1.f, 2.f, 3.f, 4.f, 5.f};
 * std::vector<Ort::Float16_t> fp16_values;
 * fp16_values.reserve(std::size(values));
 * std::transform(std::begin(values), std::end(values), std::back_inserter(fp16_values),
 *     [](float value) { return Ort::Float16_t(value); });
 *
 * }</pre>
 */
@Namespace("Ort") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class Float16_t extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Float16_t(Pointer p) { super(p); }


  /** <summary>
   *  Default constructor
   *  </summary> */
  public Float16_t() { super((Pointer)null); allocate(); }
  private native void allocate();

  /** <summary>
   *  Explicit conversion to uint16_t representation of float16.
   *  </summary>
   *  <param name="v">uint16_t bit representation of float16</param>
   *  <returns>new instance of Float16_t</returns> */
  public static native @Const @ByVal @NoException(true) Float16_t FromBits(@Cast("uint16_t") short v);

  /** <summary>
   *  __ctor from float. Float is converted into float16 16-bit representation.
   *  </summary>
   *  <param name="v">float value</param> */
  public Float16_t(float v) { super((Pointer)null); allocate(v); }
  @NoException(true) private native void allocate(float v);

  /** <summary>
   *  Converts float16 to float
   *  </summary>
   *  <returns>float representation of float16 value</returns> */
  public native @NoException(true) float ToFloat();

  /** <summary>
   *  Checks if the value is negative
   *  </summary>
   *  <returns>true if negative</returns> */

  /** <summary>
   *  Tests if the value is NaN
   *  </summary>
   *  <returns>true if NaN</returns> */

  /** <summary>
   *  Tests if the value is finite
   *  </summary>
   *  <returns>true if finite</returns> */

  /** <summary>
   *  Tests if the value represents positive infinity.
   *  </summary>
   *  <returns>true if positive infinity</returns> */

  /** <summary>
   *  Tests if the value represents negative infinity
   *  </summary>
   *  <returns>true if negative infinity</returns> */

  /** <summary>
   *  Tests if the value is either positive or negative infinity.
   *  </summary>
   *  <returns>True if absolute value is infinity</returns> */

  /** <summary>
   *  Tests if the value is NaN or zero. Useful for comparisons.
   *  </summary>
   *  <returns>True if NaN or zero.</returns> */

  /** <summary>
   *  Tests if the value is normal (not zero, subnormal, infinite, or NaN).
   *  </summary>
   *  <returns>True if so</returns> */

  /** <summary>
   *  Tests if the value is subnormal (denormal).
   *  </summary>
   *  <returns>True if so</returns> */

  /** <summary>
   *  Creates an instance that represents absolute value.
   *  </summary>
   *  <returns>Absolute value</returns> */

  /** <summary>
   *  Creates a new instance with the sign flipped.
   *  </summary>
   *  <returns>Flipped sign instance</returns> */

  /** <summary>
   *  IEEE defines that positive and negative zero are equal, this gives us a quick equality check
   *  for two values by or'ing the private bits together and stripping the sign. They are both zero,
   *  and therefore equivalent, if the resulting value is still zero.
   *  </summary>
   *  <param name="lhs">first value</param>
   *  <param name="rhs">second value</param>
   *  <returns>True if both arguments represent zero</returns> */

  /** <summary>
   *  User defined conversion operator. Converts Float16_t to float.
   *  </summary> */
  public native @Name("operator float") @NoException(true) float asFloat();
}
